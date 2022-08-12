package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductButton 
{
//	Initialization
	public  CreateProductButton(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Declaration
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement CreateProductPlusButton;

	public WebElement getCreateProductPlusButton() {
		return CreateProductPlusButton;
	}
	
//	Business logics
	/**
	 * This method is used to enter create product page
	 * @author anubhav
	 */
	public void clickOnCreateProductButton()
	{
		CreateProductPlusButton.click();
	}

}
