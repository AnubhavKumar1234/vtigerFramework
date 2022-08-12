package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
//	Initilization
	public  HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
//	Declaration
	
	@FindBy(linkText="Organizations")
	private WebElement OrgButton;
	
	@FindBy(linkText="Products")
	private WebElement ProductButton;
	
	@FindBy(name="Campaigns")
	private WebElement CampaignButton;
	
	@FindBy(partialLinkText="Sign ")
	private WebElement SingoutButton;

	public WebElement getOrgButton() {
		return OrgButton;
	}

	public WebElement getProductButton() {
		return ProductButton;
	}

	public WebElement getCampaignButton() {
		return CampaignButton;
	}

	public WebElement getSingoutButton() {
		return SingoutButton;
	}
	
	public void clickOnOrganizationModule()
	{
		OrgButton.click();
	}
	public void clickOnProductModule()
	{
		ProductButton.click();
	}
	public void clickOnCampaignModule()
	{
		CampaignButton.click();
	}
	public void clickOnSignOutButton()
	{
		SingoutButton.click();
	}
	
	
	

}
