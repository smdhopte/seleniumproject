package pomclasswithpropertyfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_Insurance_login {
	
	@FindBy(xpath="//input[@name='email']") private WebElement email;
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(xpath="//input[@name='submit']") private WebElement loginbtn;
	
	public Guru99_Insurance_login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterEmail(String EM)
	{
		email.sendKeys(EM);
	}
	public void enterPass(String PS)
	{
		password.sendKeys(PS);
	}
	public void clickLogin()
	{
		loginbtn.click();
	}

}
