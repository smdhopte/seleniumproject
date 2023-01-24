import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample4 {
	
	@BeforeClass
	public void OpenBrowser() 
	{
		Reporter.log("operning browser",true);
	}
	@BeforeMethod
	public void Login()
	{
		Reporter.log("login to app",true);
		
	}
	
	@Test(timeOut=2000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(1000);
		Reporter.log("running tc1",true);
	}
	@Test(timeOut=2000)
	public void TC2() throws InterruptedException
	{
		Thread.sleep(3000);
		Reporter.log("Running tc2",true);
	}
	@AfterMethod
	public void Logout()
	{
		Reporter.log("logout to app",true);
	}
	@AfterClass
	public void Closer()
	{
		Reporter.log("close Browser tab",true);
	}

}
