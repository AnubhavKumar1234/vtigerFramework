package comcast.vtiger.genericUtilities;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_utility
{
	/**
	 * wait for page to load before identifying any synchronized element in DOM
	 * @author Anubhav
	 */
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	/**
	 * After every action it will wait for next action to performed
	 * @author anubhav
	 */
	public void scriptTimeOut(WebDriver driver)
	{
		driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
	}
	/**
	 * used to wait for element to be clickable in GUI and check for specific element  for every 500miliseconds
	 * @param driver
	 * @param element
	 * @author anubhav
	 */
	
	public void waitForElementToBeClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	/**
	 * 
	 */
	
	public void waitForElementWithCustomTimeOut(WebDriver driver,WebElement element, int pollingTime)
	{
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeSelected(element));
		
	}
	/**
	 * used to switch from one window to any window
	 * @param driver
	 * @param PartialWindowTitle
	 * @author anubhav
	 */
	public void switchToWindow(WebDriver driver,String PartialWindowTitle)
	{
		Set<String> allId = driver.getWindowHandles();
		Iterator<String> it=allId.iterator();
		while(it.hasNext())
		{
			String wid =it.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().contains(PartialWindowTitle))
			{
				break;
			}
	   }

    }
	/**
	 * used to switch to  alert window and Accept(click on ok button)
	 * @author anubhav
	 */
	public void switchToAlertAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * used to switch to alert window and Dismiss(click on cancel button)
	 * @author anubhav
	 */
	public void switchToAlertAndDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * used to switch to frame window based on index
	 * @param driver
	 * @author anubhav
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
		
	}
	/**
	 * used to switch to frame window based on id or name attribute
	 * @param driver
	 * @author anubhav
	 * @param id_name_Attribute
	 */
	public void switchToFrame(WebDriver driver, String id_name_Attribute)
	{
		driver.switchTo().frame(id_name_Attribute);
	}
	/**
	 * used to select the value from the dropdwon based on index
	 * @param element
	 * @param index
	 * @author anubhav
	 */
	public void select(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * used to select the value from the dropdown based on text
	 */
	public void select(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	/**
	 * used to place mouse cursor on specified element
	 * @param driver
	 * @param element
	 * @author anubhav
	 */
	
	public void mouseHoverOnElement(WebDriver driver,WebElement element)
	{
		
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * used to right click on specific element
	 * @param driver
	 * @param element
	 * @author anubhav
	 * 
	 */
	public void rightClickOnElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
		
	}
}
