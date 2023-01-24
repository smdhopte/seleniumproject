package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Broker_Insurance_WebPage {
	
	@FindBy(xpath="//h4[text()=\"saradeg41@gmail.com\"]") private WebElement signinAS;
	
	@FindBy(xpath="(//input[@type=\"submit\"])[1]") private WebElement logout;
	
	public Broker_Insurance_WebPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifyEmail()
	{
		String expectedemail="saradeg41@gmail.com";
		String actualemail=signinAS.getText();
		if(expectedemail.equals(actualemail))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

	public void logOut()
	{
		logout.click();
	}
}
