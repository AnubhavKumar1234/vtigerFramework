package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignValidation 
{
//	Initialization
	public CampaignValidation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Declaration
	
	@FindBy(className="dvHeaderText")
	private WebElement actualCampaignData;

	public WebElement getActualCampaignData() {
		return actualCampaignData;
	}
	
//	Business logics
	/**
	 * This is used for the validation  in campaign before sign-out
	 * @author anubhav
	 */
	
	public String actCampaingnName()
	{
		return actualCampaignData.getText();
	}

}
