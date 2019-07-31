package qa.com.base;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {


	public static WebDriver driver;
	public static Logger logger;
	

	public static void initialization(){
	
		System.setProperty("webdriver.chrome.driver", "D:\\Sankalp\\Devops_Demo\\Driver\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		logger = Logger.getLogger("Devops_Demo");
		PropertyConfigurator.configure("Log4j.properties");
		


		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demo.cyclos.org/#login");

	}


}
