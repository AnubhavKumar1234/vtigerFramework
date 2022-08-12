package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignCreateButton 
{
//	Initialization
	public  CampaignCreateButton(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Declaration 
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement CreateCampaignButton;

	public WebElement getCreateCampaignButton() {
		return CreateCampaignButton;
	}
	
//	Business logics 
	/**
	 * This method is used to enter the create campaign page
	 * @author anubhav
	 */
	public void campaignCreatePlusButton()
	{
		CreateCampaignButton.click();
	}

}
