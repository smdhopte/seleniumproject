package mytestsuit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1 
{
		
	@Test
	public void TC1()                    //Test Case/Method
	{
		String ExpectedResult="Hi";
		
		String ActualResult="Hi";
		
		Assert.assertEquals(ActualResult, ExpectedResult);  //Hi   Hi-->Pass
	
	}
	
	
	@Test
	public void TC2()                    //Test Case/Method
	{
		String ExpectedResult="Hello";
		
		String ActualResult="Hi";
		
		Assert.assertEquals(ActualResult, ExpectedResult);  //Hi   Hello-->fail
	
	}
	
	
	

}
