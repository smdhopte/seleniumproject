package pomclasswithpropertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99_Insurance_Test extends Base_Class {
	Guru99_Insurance_login login1;
	Broker_Insurance_WebPage login2;
	@BeforeClass
	public void openBrowser() throws InterruptedException
	{
		intializeBrowser();
		login1=new Guru99_Insurance_login(driver);
		login2=new Broker_Insurance_WebPage(driver);
	}
	@BeforeMethod
	public void Login() throws IOException
	{
		login1.enterEmail(UtiityClass.getDataFromPF("EM"));
		
		login1.enterPass(UtiityClass.getDataFromPF("PASS"));
		
		login1.clickLogin();
	}
	@Test(priority=1)
	public void verifyEmailAddressOfGuru99() throws EncryptedDocumentException, IOException
	{
		String actualEmail=login2.GetText();
		
		String expectedEmail=UtiityClass.getDataFromExcellSheet(0, 0);
		Assert.assertEquals(actualEmail,expectedEmail);
		
	}
	@Test(priority=2)
	public void getTitle() throws EncryptedDocumentException, IOException
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedTitle=UtiityClass.getDataFromExcellSheet(2, 0);
		Assert.assertEquals(actualtitle, expectedTitle);
	}
	@AfterMethod
	public void Logout()
	{
		login2.logOut();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

	
}
