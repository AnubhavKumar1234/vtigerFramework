package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 public class YoutubeSong
{
	 
	

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		
		 driver.manage().window().maximize();
		 driver.get("https://www.youtube.com/");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("shoorveer");
		 driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
		 driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		 
		 
		
	   
//		 driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
		

		

	}

		
	}


