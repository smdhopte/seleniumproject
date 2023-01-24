import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyResult {
	WebDriver driver;
	@BeforeClass
	public void OpenBrowser() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
        driver.manage().window().maximize();
		
		//Wait
		Thread.sleep(2000);
		Reporter.log("operning browser",true);
	}
	@BeforeMethod
	public void Login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("F:\\velocity\\automation\\parameterization.xlsx");
        Sheet s1=WorkbookFactory.create(file).getSheet("Sheet6");
       String email=s1.getRow(0).getCell(0).getStringCellValue();
       String pass=s1.getRow(1).getCell(0).getStringCellValue();
//Enter Email
driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
//Wait
Thread.sleep(2000);
//Enter password
driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
//Wait
Thread.sleep(2000);
//Click login button
driver.findElement(By.xpath("//input[@name='submit']")).click();
		Reporter.log("login to app",true);
		
	}
	
	
	@Test
	public void TC2() throws InterruptedException
	{
		//Test Case-I: Verify Email Address
		
				String ExpectedEmail="saradeg41@gmail.com";
			
			WebElement	S1=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
			           
			    String   ActualEmail=S1.getText();  //saradeg41@gmail.com
			
			    
			   if(ExpectedEmail.equals(ActualEmail))
			   {
				   System.out.println("Pass");
			   }
			   else 
			   {
				   System.out.println("Fail");
			   }
			    Thread.sleep(2000);
	}
	
	@AfterMethod
	public void Logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@value=\"Log out\"]")).click();
		Thread.sleep(2000);
		Reporter.log("logout to app",true);
	}
	@AfterClass
	public void Closer() throws InterruptedException
	{   Thread.sleep(2000);
		driver.close();
		Reporter.log("close Browser tab",true);
	}

}
