package qa.com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.base.Base;

public class Home_Page extends Base {
	@FindBy(xpath="//div[text()='View contacts']")
	WebElement lnk_ViewContacts;
	
	
	@FindBy(xpath="//td[@class='formField firstFormField' ]/input")
	WebElement txt_Keyword;
	
	@FindBy(xpath="//div[text()='Search']")
	WebElement btn_Search;
	
	
	@FindBy(xpath="//div[text()='Demo ten']")
	WebElement searched_contact;
	
	@FindBy(xpath = "//span[text()='demo']")
	WebElement userNameLabel;

	public Home_Page(){
		PageFactory.initElements(driver, this);
	}
	
	public void veiwContact() {
		lnk_ViewContacts.click();
		
	}
	
	public void myContact() {
		txt_Keyword.clear();
		txt_Keyword.sendKeys("ten");
	}
	
	public void search() {
		btn_Search.click();
	}
	
	public boolean validatecyclosImage(){
		return searched_contact.isDisplayed();
	}
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	

	/*public void searchedContact() {
		
	}*/
	
}
