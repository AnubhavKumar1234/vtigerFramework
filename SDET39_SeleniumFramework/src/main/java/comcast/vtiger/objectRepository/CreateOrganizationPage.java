package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage 
{
//	Initilization
	public  CreateOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Declaration
	@FindBy(name="accountname")
	private WebElement OrganizationNameTextField;
	
	@FindBy(name="button")
	private WebElement SaveButton;

	public WebElement getOrganizationNameTextField() {
		return OrganizationNameTextField;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
//Business logics
	/**
	 * This is used to create organization
	 * @param organization name
	 * @author anubhav
	 */
	public void createOrganizationTxtField(String orgname)
	{
		OrganizationNameTextField.sendKeys(orgname);
	}
	public void clickSaveButtonCreateOrganization()
	{
		SaveButton.click();
	}
}
