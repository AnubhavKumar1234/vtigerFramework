package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToVtiger 
{

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fis=new FileInputStream("./data.properties");
		
		Properties p=new Properties();
		p.load(fis);
		
		
		String Url=p.getProperty("url");
		String User=p.getProperty("user");
		String Password=p.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(Url);
		driver.findElement(By.name("user_name")).sendKeys(User);
		driver.findElement(By.name("user_password")).sendKeys(Password);
		driver.findElement(By.id("submitButton")).click();
		
		
		
		

	}

}
