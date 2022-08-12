package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductValidation 
{
//	Initialization
	public ProductValidation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Declaration
	@FindBy(className="lvtHeaderText")
	private WebElement actualProductData;

	public WebElement getActualProductData() 
	{
		return actualProductData;
	}
//	Business logics
	/**
	 * This is used for the validation before sign-out
	 * @author anubhav
	 */
	public String actualProductName()
	{
		return actualProductData.getText();
	}
}
