package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage 
{
//	Initializaton
	public  CreateCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
//	Declaration
	@FindBy(name="campaignname")
	private WebElement campaignNameTextField;
	
	@FindBy(name="button")
	private WebElement CampaignSaveButton;

	public WebElement getCampaignNameTextField() {
		return campaignNameTextField;
	}

	public WebElement getCampaignSaveButton() {
		return CampaignSaveButton;
	}
	
//	Business logics
	/**
	 * This method is used to create campaign
	 * @param campaign name
	 * @author anubhav
	 */
	
	public void createCampaignTxtField(String campaigname)
	{
		campaignNameTextField.sendKeys(campaigname);
	}
	public void campaignsavebtton()
	{
		CampaignSaveButton.click();
	}

}
