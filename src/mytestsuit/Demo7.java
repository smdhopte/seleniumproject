package mytestsuit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo7 {
	

		@Test
		public void TC5()             //Test Case/Method
		{
			Reporter.log("Running TC5",true);
		}
		
		
		@Test
		public void TC6()             //Test Case/Method
		{
			Assert.fail();
			Reporter.log("Running TC6",true);
		}

}
