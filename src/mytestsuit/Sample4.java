package mytestsuit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample4 
{

	@Test
	public void TC1()                    //Test Case/Method
	{
	    String str=null;
   
	    Assert.assertNull(str);   //Pass
	
	}
	
	
	@Test
	public void TC2()                    //Test Case/Method
	{
	    String str="abcd@gmail.com";
   
	    Assert.assertNull(str);   //fail
	
	}
	@Test
	public void TC4()                    //Test Case/Method
	{
	    String str=null;
   
	    Assert.assertNotNull(str);   //fail
	
	}
	
	
	@Test
	public void TC5()                    //Test Case/Method
	{
	    String str="abcd@gmail.com";
   
	    Assert.assertNotNull(str);   //pass
	
	}
	
	
	
}
