package practice;

import org.testng.annotations.Test;

public class RunTimeParameterFromEclipse 
{
	@Test
	public void getRunTimeData() 
	{
		System.out.println(System.clearProperty("browser"));
		System.out.println(System.clearProperty("url"));
		System.out.println(System.clearProperty("user"));
		System.out.println(System.clearProperty("password"));
	}

}
