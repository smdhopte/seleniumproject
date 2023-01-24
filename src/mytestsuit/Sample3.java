package mytestsuit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample3 
{

	@Test
	public void TC1()                    //Test Case/Method
	{
	
    boolean ActualResult=true;
    
    Assert.assertTrue(ActualResult);  //true--->Pass
	
	}
	
	@Test
	public void TC2()                    //Test Case/Method
	{
	
    boolean ActualResult=false;
    
    Assert.assertTrue(ActualResult);  //false--->Fail
	
	}
	@Test
	public void TC3()                    //Test Case/Method
	{
	
    boolean ActualResult=true;
    
    Assert.assertFalse(ActualResult);  //true--->fail
	
	}
	
	@Test
	public void TC4()                    //Test Case/Method
	{
	
    boolean ActualResult=false;
    
    Assert.assertFalse(ActualResult);  //false--->true
	
	}
	
	
	
}
