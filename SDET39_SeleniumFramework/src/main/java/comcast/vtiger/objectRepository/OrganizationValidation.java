package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationValidation 
{
//	initialization
	public OrganizationValidation (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

//	Declaration
	@FindBy(className="dvHeaderText")
	private WebElement actualOrganizationData;

	public WebElement getActualOrganizationData() {
		return actualOrganizationData;
	}
	
//	Business logics
	
	/**
	 * This is used for the validation  in organization before sign-out
	 * @author anubhav
	 */
	public String actOrgaizationName()
	{
		return actualOrganizationData.getText();
		
	}
}
