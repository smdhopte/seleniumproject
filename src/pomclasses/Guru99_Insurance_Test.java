package pomclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_Insurance_Test {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		//Parameter-I: Name of the Browser
		 //Parameter-II:Path of chromeDriver.exe file
			
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver.exe");	
			
		//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
			WebDriver driver=new ChromeDriver();
			
			
			//To open an application/To enter an URL
			driver.get("https://demo.guru99.com/insurance/v1/index.php");
			
			driver.manage().window().maximize();
			
			//Waithttps://demo.guru99.com/insurance/v1/index.php
			Thread.sleep(2000);
			FileInputStream file=new FileInputStream("F:\\velocity\\automation\\parameterization.xlsx");
			Sheet sh=WorkbookFactory.create(file).getSheet("Sheet8");
			String EM=sh.getRow(0).getCell(0).getStringCellValue();
			
			Guru99_Insurance_login login1=new Guru99_Insurance_login(driver);
			login1.enterEmail(EM);
			Thread.sleep(1000);
			
			String PS=sh.getRow(1).getCell(0).getStringCellValue();
			login1.enterPass(PS);
			Thread.sleep(1000);
			
			login1.clickLogin();
			
			Broker_Insurance_WebPage login2=new Broker_Insurance_WebPage(driver);
			login2.verifyEmail();
			Thread.sleep(1000);
			
			login2.logOut();
			
			

	}

}
