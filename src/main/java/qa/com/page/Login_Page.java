package qa.com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.base.Base;

public class Login_Page extends Base {
	
	@FindBy(xpath="//input[@name='principal']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Sign in']")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//div[@class='headerContents']/img")
	WebElement cycloLogo;
	
	
	
	//Initializing the Page Objects:
	public Login_Page(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validatecyclosImage(){
		return cycloLogo.isDisplayed();
	}
	
	public Home_Page login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new Home_Page();

	}

	public void clickSignIn(){
		loginBtn.click();
	}
}
