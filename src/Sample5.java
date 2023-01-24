import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample5 {
	
	@Test
	public void TC1()
	{
        String S1="Hi";
		
		String S2="Hello";
		
		String S3="Good Morning";
		
		
		Assert.assertNotEquals(S2, S1);   //Pass
	
		Assert.assertEquals(S2, S1);     //Fail
		
		Assert.assertEquals(S3, S1);  //Fail
		
		Assert.assertNotEquals(S1, S3);  //Pass
	}
}
