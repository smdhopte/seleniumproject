import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 {
	
	@BeforeClass
	public void OpenBrowser() 
	{
		Reporter.log("operning browser",true);
	}
	@BeforeMethod
	public void Login()
	{
		//Assert.fail();
		Reporter.log("login to app",true);
		
	}
	
	@Test
	public void TC1()
	{
		Reporter.log("running tc1",true);
	}
	@Test(dependsOnMethods= {"TC1"})
	public void TC2()
	{
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
