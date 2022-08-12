package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertSample 
{
	@Test
	public void createCustomerTest()
	{
		
		System.out.println("step 1");
		System.out.println("step 2");
		SoftAssert sfat=new SoftAssert();
		sfat.assertEquals("A", "A");
		
		System.out.println("step 3");
		System.out.println("step 4");
		sfat.assertAll();
		
	}
	
	@Test
	public void modifyCustomerTest()
	{
		
		System.out.println("===============================================================");
		System.out.println("step 1");
		
		
		System.out.println("step 2");
		System.out.println("step 3");
	}

}
