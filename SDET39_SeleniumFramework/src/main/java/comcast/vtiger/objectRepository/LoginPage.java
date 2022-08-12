package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
//	initilization
	public  LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
//	Declaration
	@FindBy (name="user_name")
	private WebElement UserNameTextField;
	
	@FindBy (name="user_password")
	private WebElement UserPasswordTextField;
	
	@FindBy (id="submitButton")
	private WebElement SubmitButton;

	public WebElement getUserNameTextField() {
		return UserNameTextField;
	}

	public WebElement getUserPasswordTextField() {
		return UserPasswordTextField;
	}

	public WebElement getSubmitVutton() {
		return SubmitButton;
	}
	
//	Business logics
	/**
	 * This method is used for login to app
	 * @param username
	 * @param password
	 * @author anubhav
	 * 
	 */
	
	public void login1(String username)
	{
		UserNameTextField.sendKeys(username);
	}
	public void login2(String password)
	{
		UserPasswordTextField.sendKeys(password);
	}
	public void clickLogin()
	{
		SubmitButton.click();
	}
		
		
		
	
	
	

}
