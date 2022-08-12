package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaigntWithProductValidation 
{
//	Initialization
	public CreateCampaigntWithProductValidation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Declaration
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement actCampaignWithProductData;

	public WebElement getActCampaignData() {
		return actCampaignWithProductData;
	}
	
	
//	Business logics
	
	/**
	 * This is used for the validation  in campaignwithproduct before sign-out
	 * @author anubhav
	 */
	
	public String actCampaignWithProductName()
	{
		return actCampaignWithProductData.getText();
	}

}
