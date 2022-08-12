package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{
//	Initilization
	public  OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//	Declaration
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement OrgPlusButton;
	public WebElement getOrgPlusButton() 
	{
		return OrgPlusButton;
	}
	
	
	
//	Business logics
	/**
	 * This method is used to click on createorganization plus button
	 * @author anubhav
	 */
	
	public void createOrganizationButton()
	{
		OrgPlusButton.click();
	}

}
