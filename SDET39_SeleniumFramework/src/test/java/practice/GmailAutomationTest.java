package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtilities.File_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailAutomationTest 
{
	@Test
	public void gmailAutomationTest() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		Dimension dimension = new org.openqa.selenium.Dimension(900,900);
		driver.manage().window().setSize(dimension);
		File_Utility fil=new File_Utility();
		String Url = fil.getFileKeyValue("url1");
		String User = fil.getFileKeyValue("user1");
		String Password = fil.getFileKeyValue("pwd1");
		
		driver.get(Url);
		driver.findElement(By.name("identifier")).sendKeys(User);
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		
		
		
	}

}
