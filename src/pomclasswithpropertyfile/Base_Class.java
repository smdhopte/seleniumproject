package pomclasswithpropertyfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public WebDriver driver;
	public void intializeBrowser() throws InterruptedException
	{
		//Parameter-I: Name of the Browser
		 //Parameter-II:Path of chromeDriver.exe file
			
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver.exe");	
			
		//Create object of Chromedriver class and provide reference of WebDriver(upcasting)
			 driver=new ChromeDriver();
			
			//To open an application/To enter an URL
			driver.get("https://demo.guru99.com/insurance/v1/index.php");
			
			driver.manage().window().maximize();
			
			//Wait https://demo.guru99.com/insurance/v1/index.php
			Thread.sleep(2000);
	}

}
