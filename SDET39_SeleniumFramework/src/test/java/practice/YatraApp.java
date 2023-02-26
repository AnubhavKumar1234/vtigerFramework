package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YatraApp 
{
	@Test
	public void departButton() throws IOException, InterruptedException
	{
		
		 
		 
		WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		
		 driver.manage().window().maximize();
		 FileInputStream fis=new FileInputStream("./data2.properties");
			
			Properties p=new Properties();
			p.load(fis);
			String Month=p.getProperty("month");
//			String DAY=p.getProperty("daY");
			
		 driver.get("https://www.yatra.com/");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//li[@class='datepicker flex1']")).click();
		 Thread.sleep(3000);
		 while(true)
		 {
		 Object mvfy = driver.findElement(By.xpath("//div[@class='active-month-holder']")).getText();
		 if(mvfy.equals(Month))
		 {
			 break;
		 }
		 }
		 driver.findElement(By.xpath("//td[@title='Monday, 24 October 2022']")).click();
		 driver.findElement(By.xpath("//*[@id=\"booking_engine_modues\"]/div/div[3]/div/i")).click();
	
	}

}
