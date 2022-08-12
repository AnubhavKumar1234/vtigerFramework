package practice;

import org.testng.annotations.Test;

public class sample1 
{


	@Test(invocationCount=3,priority=-1)
	public void bikeName()
	{
		System.out.println("Royal enfield");
	}
	@Test(priority=1)
	public void modifyBike()
	{
		System.out.println("Cruisor bike");
	}

}
