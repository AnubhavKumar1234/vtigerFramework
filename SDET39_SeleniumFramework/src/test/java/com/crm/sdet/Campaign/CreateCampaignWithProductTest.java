

package com.crm.sdet.Campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtilities.BaseClass;
import comcast.vtiger.genericUtilities.Excel_utility;
import comcast.vtiger.genericUtilities.Java_utility;
import comcast.vtiger.genericUtilities.WebDriver_utility;
import comcast.vtiger.objectRepository.CampaignCreateButton;
import comcast.vtiger.objectRepository.CreateCampaignPage;
import comcast.vtiger.objectRepository.CreateCampaignWithProductPage;
import comcast.vtiger.objectRepository.CreateCampaigntWithProductValidation;
import comcast.vtiger.objectRepository.CreateProductButton;
import comcast.vtiger.objectRepository.CreateProductPage;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.ProductPopUp;

public class CreateCampaignWithProductTest extends BaseClass {
    @Test(groups={"regressionTest"})
	public  void createCampaignWithProduct() throws Throwable
	{
	
		WebDriver_utility wlib=new WebDriver_utility();
		
		Java_utility j=new Java_utility();
		Excel_utility e=new Excel_utility ();
		
		
		HomePage homepage=new HomePage(driver);
		homepage.clickOnProductModule();
		
		CreateProductButton  createproductbutton=new CreateProductButton(driver);
		createproductbutton.clickOnCreateProductButton();
		
	

		 
		    int RanNum=j.getRandomNum();
		   String  exclvalue= e.getExcelData("Organization", 2, 0)+RanNum;
		   

		   CreateProductPage createproductpage=new CreateProductPage(driver);
		   createproductpage.createProductTxtField(exclvalue);
		   createproductpage.ProductSaveButton();
		   
			 WebElement element = driver.findElement(By.xpath("//a[text()='More']"));

				Actions a=new Actions(driver);
				a.moveToElement(element).perform();
				homepage.clickOnCampaignModule();
				CampaignCreateButton createcampaignbutton=new CampaignCreateButton(driver);
				createcampaignbutton.campaignCreatePlusButton();
				

				
				int RanNum1=j.getRandomNum();
				

				String exclv2 = e.getExcelData("Organization",1, 0)+RanNum1;
				CreateCampaignPage createcampaignpage=new CreateCampaignPage(driver);
				createcampaignpage.createCampaignTxtField(exclv2);
				
				CreateCampaignWithProductPage createcampaignwithproduct=new CreateCampaignWithProductPage(driver);
				createcampaignwithproduct.productPopUpButton();
				
				
				

				Thread.sleep(3000);
				
				
				
				
				     wlib.switchToWindow(driver, "Products&action");
				     ProductPopUp productpopup=new ProductPopUp(driver);
				     
				     productpopup.productPopTxtField(exclvalue);
				     productpopup.clickSearchButton(driver);
				     
				     
				     
				     
					

					wlib.switchToWindow(driver,"Campaigns&action" );
					createcampaignpage.campaignsavebtton();
					
					CreateCampaigntWithProductValidation createCampaigWthProduct=new CreateCampaigntWithProductValidation(driver);
					String actaulCampaignWithProductData = createCampaigWthProduct.actCampaignWithProductName();
					Assert.assertEquals(actaulCampaignWithProductData.contains(exclv2),true);
//					String actData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
//					
//					if(actData.contains(exclv2))
//					{
//						System.out.println("pass");
//					}
//					else
//					{
//						System.out.println("Fail");
//					}
					
					WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

				wlib.mouseHoverOnElement(driver,ele);
					
						
					driver.findElement(By.linkText("Sign Out")).click();

					 
					 
				
				}
				
			
				
				

	

//		Product1504303275
		
	
		
		
}