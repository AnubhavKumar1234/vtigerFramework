package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage 
{
//	Initialization
	public  CreateProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Declaration
	@FindBy(name="productname")
	private WebElement ProductNameTextField;
	
	@FindBy(name="button")
	private WebElement ProductSaveButton;

	public WebElement getProductNameTextField() {
		return ProductNameTextField;
	}

	public WebElement getProductSaveButton() {
		return ProductSaveButton;
	}
	
//	Business logics
	
	/**
	 * @param productname
	 * @author anubhav
	 */
	public void createProductTxtField(String productname)
	{
		ProductNameTextField.sendKeys(productname);
	}
	public void ProductSaveButton()
	{
		ProductSaveButton.click();
		
	}

}
