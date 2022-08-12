package com.crm.sdet.Campaign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtilities.BaseClass;
import comcast.vtiger.genericUtilities.Excel_utility;
import comcast.vtiger.genericUtilities.File_Utility;
import comcast.vtiger.genericUtilities.Java_utility;
import comcast.vtiger.objectRepository.CampaignCreateButton;
import comcast.vtiger.objectRepository.CampaignValidation;
import comcast.vtiger.objectRepository.CreateCampaignPage;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.LoginPage;

public class CreateCampaignTest extends BaseClass 
{
	
	
	
     @Test(groups={"regressionTest"})
	public  void createCampaign() throws Throwable
	{
		
		Java_utility j=new Java_utility();
		
//		driver.findElement(By.name("user_name")).sendKeys(User);
//		driver.findElement(By.name("user_password")).sendKeys(Pwd);
//		driver.findElement(By.id("submitButton")).click();
		
		WebElement dr = driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(dr).perform();
		HomePage homepage=new HomePage(driver);
		homepage.clickOnCampaignModule();
		
//		driver.findElement(By.name("Campaigns")).click();
		
		CampaignCreateButton createcampaignbutton=new CampaignCreateButton(driver);
		createcampaignbutton.campaignCreatePlusButton();
		
//		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		
//		Random ra=new Random();
//		int ranNum=ra.nextInt();
		int RanNum=j.getRandomNum();
		
//		FileInputStream fis1=new FileInputStream("./Book1.xlsx"); 
//		Workbook wb = WorkbookFactory.create(fis1);
//		Sheet sh = wb.getSheet("Organization");
//		
//		Row r= sh.getRow(3);
//		Cell cel = r.getCell(0);
//		String orgName = cel.getStringCellValue()+RanNum;
//		System.out.println(orgName);
		Excel_utility e=new Excel_utility();
		String s= e.getExcelData("Organization", 1, 0)+RanNum;
		
		CreateCampaignPage createcampaignpage=new CreateCampaignPage(driver);
		createcampaignpage.createCampaignTxtField(s);
		createcampaignpage.campaignsavebtton();
		
		CampaignValidation actCampaignData=new CampaignValidation(driver);
		String actaulcampgData = actCampaignData.actCampaingnName();
		Assert.assertEquals(actaulcampgData.contains(s),true);
		
		
		
//		driver.findElement(By.name("campaignname")).sendKeys(s);
//		driver.findElement(By.name("button")).click();
		
//		String actualtext = driver.findElement(By.className("dvHeaderText")).getText();
//		if(actualtext.contains(s))
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
