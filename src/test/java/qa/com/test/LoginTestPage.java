package qa.com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.base.Base;
import qa.com.page.Home_Page;
import qa.com.page.Login_Page;

public class LoginTestPage extends Base {
	Login_Page loginPage;
	Home_Page homePage;
	
	public LoginTestPage(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		logger.info("Browser get open");
		logger.info("Browser get maximized");
		loginPage = new Login_Page();	
		
	}
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cyclos4 Communities");
		logger.info("Validating the title of Cyclos");
	}
	/*@Test(priority=2)
	public void cycloLogoImageTest(){
		boolean flag = loginPage.validatecyclosImage();
		Assert.assertTrue(flag);
		logger.info("validating cyclo logo");
	}*/

	@Test(priority=2)
	public void loginToCyclo() {
		loginPage.login("demo", "1234");
		logger.info("Enter the username and password");
		loginPage.clickSignIn();
		 
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
		logger.info("After completing task browser get quit");
	}


}
