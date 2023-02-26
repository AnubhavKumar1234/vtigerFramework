package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHovering {

	public static void main(String[] args) 
	{
		WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com/");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 WebElement ele = driver.findElement(By.id("nav-link-accountList"));
		 System.out.println(ele.getText()); 
		 
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).perform();
		
		 
		 
		

	}

}
