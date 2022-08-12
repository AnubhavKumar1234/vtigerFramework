package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;







public class MakeMyTrip {

	public static void main(String[] args) {
		
	 
	 
	 
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 
	 driver.get("https://www.makemytrip.com/");
	 WebElement from =driver.findElement(By.xpath("//input[@id='fromCity']"));
	 WebElement toDes =driver.findElement(By.xpath("//input[@id='toCity']"));
	 
	 from.sendKeys("Bengaluru");
	 driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
	 toDes.sendKeys("Mumbai");
	 driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
	 //driver.findElement(By.xpath("//span[@class='langCardClose]")).click();
	 driver.findElement(By.xpath("//label[@for='departure']")).click();
	 String requiredMonth="November";
	 String requiredYear="2022";
	 String requiredDate="30";
	String currentMonthYear = driver.findElement(By.className("DayPicker-Caption")).getText();
	String currentMonth = currentMonthYear.split(" ")[0];
	String currentYear = currentMonthYear.split(" ")[1];
	
	while(!(currentMonth.equalsIgnoreCase(requiredMonth)&&currentYear.equals(requiredYear)))
	{
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		currentMonthYear=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		currentMonth=currentMonthYear.split(" ")[0];
		currentYear=currentMonthYear.split(" ")[1];
		
	}
	
	driver.findElement(By.xpath("(//p[.='"+requiredDate+"'])[2]"));
	
	
	 
	}
}
