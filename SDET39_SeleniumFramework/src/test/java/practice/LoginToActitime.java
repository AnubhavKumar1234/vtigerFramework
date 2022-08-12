package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActitime 
{

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fis=new FileInputStream("./data1.properties");
		
		Properties p=new Properties();
		p.load(fis);
		
		
		String Url=p.getProperty("url");
		String User=p.getProperty("user");
		String Password=p.getProperty("pwd");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(Url);
		driver.findElement(By.name("username")).sendKeys(User);
		driver.findElement(By.name("pwd")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		

	}

}
