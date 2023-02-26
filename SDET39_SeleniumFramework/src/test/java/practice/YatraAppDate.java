package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import comcast.vtiger.genericUtilities.File_Utility;
import comcast.vtiger.genericUtilities.WebDriver_utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class YatraAppDate {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();

		WebDriver_utility wlib = new WebDriver_utility();
		wlib.waitForPageToLoad(driver);
		//driver.get("https://www.yatra.com/");

		File_Utility plib = new File_Utility();
		String Url = plib.getFileKeyValue("url2");
		driver.get(Url);

		driver.findElement(By.xpath("//label[@for='BE_flight_origin_date']")).click();
		
		String requiredMonth = "November";
		String requiredYear = "2022";
		String requiredDate = "12";
		String currentmonthyear = driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).getText();
		System.out.println(currentmonthyear);
		
		String currentmonth = currentmonthyear.split(" ")[0];
		String currentYear = currentmonthyear.split(" ")[1];
		while(!(currentmonth.equalsIgnoreCase(requiredMonth)&&currentYear.equals(requiredYear)))
		{
		
		String currentmonthyear1 = driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).getText();
		System.out.println(currentmonthyear1);
		
		String currentmonth1 = currentmonthyear1.split(" ")[0];
		String currentYear1 = currentmonthyear.split(" ")[1];
		}
		
		driver.findElement(By.xpath("//td[normalize-space (text()='"+requiredDate+"')]")).click();

	}

}
