package com.crm.sdet.organization;

import java.io.FileNotFoundException;

import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtilities.BaseClass;
import comcast.vtiger.genericUtilities.Excel_utility;
import comcast.vtiger.genericUtilities.File_Utility;
import comcast.vtiger.genericUtilities.Java_utility;
import comcast.vtiger.genericUtilities.WebDriver_utility;
import comcast.vtiger.objectRepository.CreateOrganizationPage;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.OrganizationPage;
import comcast.vtiger.objectRepository.OrganizationValidation;
//@Listeners(comcast.vtiger.genericUtilities.ListenersImplementationClass.class)

public class CreateOrganizationTest extends BaseClass 
{
    @Test(groups={"regressionTest"})
	public  void  createOrganization() throws Throwable
	{
    	WebDriver_utility wlib=new WebDriver_utility();
    	wlib.waitForPageToLoad(driver);
    	
		
		
		Java_utility j=new Java_utility();
		
		
		
	
		
		HomePage homepage=new HomePage(driver);
		homepage.clickOnOrganizationModule();
		
		OrganizationPage organizationpage=new  OrganizationPage(driver);
		
		organizationpage.createOrganizationButton();
		
				
		
		
		
		
		
		
		
	
//		driver.findElement(By.name("user_name")).sendKeys(User);
//		driver.findElement(By.name("user_password")).sendKeys(Pwd);
//		driver.findElement(By.id("submitButton")).click();
		
//		driver.findElement(By.linkText("Organizations")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
//		Random ra=new Random();
//		int ranNum=ra.nextInt(1000);
		
		int RanNum=j.getRandomNum();
		
//		FileInputStream fis1=new FileInputStream("./Book1.xlsx"); 
//		Workbook wb = WorkbookFactory.create(fis1);
		Excel_utility e=new Excel_utility();
		String s= e.getExcelData("Organization", 1, 0)+RanNum;
		
		CreateOrganizationPage  createorganizationpage=new CreateOrganizationPage(driver);
		createorganizationpage.createOrganizationTxtField(s);
		createorganizationpage.clickSaveButtonCreateOrganization();
		
		OrganizationValidation organizationActData=new OrganizationValidation(driver);
		String actualOrganizationName = organizationActData.actOrgaizationName();
		Assert.assertEquals(actualOrganizationName.contains(s),true);
		
		

		
//		String actData = driver.findElement(By.className("dvHeaderText")).getText();
//		
//		if(actData.contains(s))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
		WebElement admin = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(admin).perform();
		homepage.clickOnSignOutButton();
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	

}
