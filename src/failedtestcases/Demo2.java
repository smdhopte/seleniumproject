package failedtestcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2
{
	
	@Test
	public void TC3()             //Test Case/Method
	{
		Assert.fail();
		Reporter.log("Running TC3",true);
	}
	
	
	@Test
	public void TC4()             //Test Case/Method
	{
		Reporter.log("Running TC4",true);
	}

	
}

