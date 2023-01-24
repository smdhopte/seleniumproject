import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	WebDriver driver;
	@BeforeClass
	public void OpenBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		Reporter.log("operning browser",true);
	}
	@BeforeMethod
	public void Login()
	{
		driver.get("https://www.facebook.com/");
		Reporter.log("login to app",true);
		
	}
	
	@Test
	public void TC1()
	{
		String actualtitle=driver.getTitle();
		String expected="Facebook – l sign up";
		assertEquals(actualtitle,expected);
		Reporter.log("running tc1",true);
	}
	
	@AfterMethod
	public void Logout()
	{
		Reporter.log("logout to app",true);
	}
	@AfterClass
	public void Closer()
	{   driver.close();
		Reporter.log("close Browser tab",true);
	}

}
