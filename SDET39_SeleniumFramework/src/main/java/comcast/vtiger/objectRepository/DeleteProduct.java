package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProduct 
{
//	Initialization
	
	public  DeleteProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Declaration
	
	@FindBy(name="Delete")
	private WebElement deletebutton;

	public WebElement getDeletebutton() {
		return deletebutton;
	}
	
//	Business logics
	
	/**
	 * This method is used to delete the created product
	 * @author anubhav
	 */
	
	public void deleteProductIcon()
	{
		deletebutton.click();
	}

}
