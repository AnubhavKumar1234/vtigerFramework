package comcast.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mysql.cj.jdbc.Driver;

public class ProductPopUp 
{
//	Initialization
	public  ProductPopUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//	Declaration
	
	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement ProductPopUpSearchTextField;
	
	@FindBy(name="search")
	private WebElement ProductPopUpSearchButton;

	public WebElement getProductPopUpSearchTextField() {
		return ProductPopUpSearchTextField;
	}

	public WebElement getProductPopUpSearchButton() {
		return ProductPopUpSearchButton;
	}
	
	
//	Business logics
	/**
	 * This is used to search the created product and add it to product textfield in campaign page
	 * @param productname
	 * @author anubhav
	 */
	public void productPopTxtField(String exclvalue)
	{
		ProductPopUpSearchTextField.sendKeys(exclvalue);
	}
	public void clickSearchButton(WebDriver driver)
	{
		ProductPopUpSearchButton.click();
		
		driver.findElement(By.id("1")).click();
		
		
		
		
	}

}
