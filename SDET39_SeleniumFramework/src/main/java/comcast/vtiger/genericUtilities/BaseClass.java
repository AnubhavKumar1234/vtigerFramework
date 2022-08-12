package comcast.vtiger.genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import comcast.vtiger.objectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	
	public WebDriver driver;
	public static WebDriver sDriver;
	File_Utility f=new File_Utility();
	@BeforeSuite(groups={"smokeTest","regressionTest"})
	public void BS()
	{
		System.out.println("DataBase Connection");
	}
	@BeforeTest(groups={"smokeTest","regressionTest"})
	public void BT()
	{
		System.out.println("Execute script in Parallel Mode");
	}
//	@Parameters("BROWSER")
	@BeforeClass(groups={"smokeTest","regressionTest"})
	public void BC( ) throws Throwable
	{
		String Browser=f.getFileKeyValue("browser");
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else
			if(Browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
			}
			else
				if(Browser.equalsIgnoreCase("edge"))
				{
					WebDriverManager.edgedriver().setup();
					 driver=new EdgeDriver();
				}
				else
				{
					 driver=new ChromeDriver();
				}
		sDriver=driver;
	}
	@BeforeMethod(groups={"smokeTest","regressionTest"})
	public void BM() throws Throwable
	{
		
		  System.out.println("Login to Application");
		  
		  String Url=f.getFileKeyValue("url");
		  String UN=f.getFileKeyValue("user");
		  String PW=f.getFileKeyValue("password");
		  driver.get(Url);
		  LoginPage loginpage = new LoginPage(driver);
		  loginpage.login1(UN);
		  loginpage.login2(PW);
		  loginpage.clickLogin();
		  
	}
	@AfterMethod(groups={"smokeTest","regressionTest"})
	public void AM()
	{
		System.out.println("Logout From Application");
	}
	@AfterClass(groups={"smokeTest","regressionTest"})
	public void AC()
	{
		System.out.println("Closing The Browser");
	}
	@AfterTest(groups={"smokeTest","regressionTest"})
	public void AT()
	{
		System.out.println("Closing the The parallel execution");
	}
	@AfterSuite(groups={"smokeTest","regressionTest"})
	public void AS()
	{
		System.out.println("Closing The DataBase Connection");
	}

}
