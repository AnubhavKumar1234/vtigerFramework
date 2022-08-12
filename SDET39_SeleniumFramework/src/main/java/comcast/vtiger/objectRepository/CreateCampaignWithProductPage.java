package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignWithProductPage 
{
//	Initializaton
	public  CreateCampaignWithProductPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
//	Declaration
	@FindBy(name="campaignname")
	private WebElement campaignNameTextField;
	
	@FindBy(name="button")
	private WebElement CampaignSaveButton;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement ProductPopUpPlusButton;

	public WebElement getCampaignNameTextField() {
		return campaignNameTextField;
	}

	public WebElement getCampaignSaveButton() {
		return CampaignSaveButton;
	}

	public WebElement getProductPopUpPlusButton() {
		return ProductPopUpPlusButton;
	}
	
//	Business logics
	/**
	 * @param campaignname
	 * @author anubhav
	 */
	public void createCampaignWithProductTxtField(String campaignname)
	{
		campaignNameTextField.sendKeys(campaignname);
		
	}
	public void  campaignsavebutton()
	{
		CampaignSaveButton.click();
	}
	public void productPopUpButton()
	{
		ProductPopUpPlusButton.click();
		
	}

}
