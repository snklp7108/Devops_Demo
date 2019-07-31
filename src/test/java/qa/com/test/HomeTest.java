package qa.com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.base.Base;
import qa.com.page.Home_Page;
import qa.com.page.Login_Page;

public class HomeTest extends Base {
	Login_Page loginPage;
	Home_Page homePage;

	public HomeTest(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		logger.info("Browser get open");
		logger.info("Browser get maximized");
		loginPage = new Login_Page();
		homePage= new Home_Page();
		loginPage.login("demo", "1234");
		logger.info("Enter the username and password");
		logger.info("Click on Signin");

	}

	@Test(priority=1)
	public void verifyUsernameTest(){
		Assert.assertTrue(homePage.verifyCorrectUserName());
		//homePage.verifyCorrectUserName();
		logger.info("verifying the correct username");

	}
	@Test(priority=2)
	public void lnkViewContactTest(){
		homePage.veiwContact();
		logger.info("Click on view contact tab");

	}
	@Test(priority=3)
	public void myContactTest(){
		homePage.veiwContact();
		logger.info("Click on view contact tab");
		homePage.myContact();
		logger.info("Enter the contact your are looking for");
		homePage.search();
		logger.info("Click on search button");
	}


	@AfterMethod
	public void tearDown(){
		driver.quit();
		logger.info("After completing task browser get quit");
	}
}
