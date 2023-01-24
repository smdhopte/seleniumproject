package mytestsuit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 
{
	@Test
	public void TC1()                    //Test Case/Method
	{
		String ExpectedResult="Hello";
		
		String ActualResult="Hi";
		
		Assert.assertNotEquals(ActualResult, ExpectedResult);  //Hi   Hello-->Pass
	
	}
	
	
	@Test
	public void TC2()                    //Test Case/Method
	{
		String ExpectedResult="Hi";
		
		String ActualResult="Hi";
		
		Assert.assertNotEquals(ActualResult, ExpectedResult);  //Hi   Hi-->fail
	
	}
}
