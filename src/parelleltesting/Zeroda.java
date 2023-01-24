package parelleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zeroda {
	
	@Test
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://zerodha.com/");
	}

}
