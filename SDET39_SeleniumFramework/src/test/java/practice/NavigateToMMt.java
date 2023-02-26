package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateToMMt {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize(); 
		 FileInputStream fis=new FileInputStream("./data2.properties");
			
			Properties p=new Properties();
			p.load(fis);
			String Url=p.getProperty("url2");
			String Vtext = p.getProperty("text");
			 driver.get(Url);
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 
			 driver.findElement(By.xpath("//label[@for='fromCity']")).click();
			 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Vtext);
		 
		

	}

}
