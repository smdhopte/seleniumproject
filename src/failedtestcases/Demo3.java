package failedtestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 
{
	@Test
	public void TC1()             //Test Case/Method
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test
	public void TC2()             //Test Case/Method
	{
		Reporter.log("Running TC2",true);
	}
	
}

