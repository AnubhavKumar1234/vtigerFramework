package com.crm.sdet.Product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtilities.BaseClass;
import comcast.vtiger.genericUtilities.Excel_utility;
import comcast.vtiger.genericUtilities.Java_utility;
import comcast.vtiger.genericUtilities.WebDriver_utility;
import comcast.vtiger.objectRepository.CreateProductButton;
import comcast.vtiger.objectRepository.CreateProductPage;
import comcast.vtiger.objectRepository.DeleteProduct;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.ProductValidation;

public class CreateDeleteProductTest extends BaseClass 
{
	
     @Test(groups={"regressionTest"})
	public  void createDeleteProduct() throws Throwable
	{
		WebDriver_utility wlib=new WebDriver_utility();
		
		Java_utility j=new Java_utility();
		
		
		HomePage homepage=new HomePage(driver);
		homepage.clickOnProductModule();
		
		CreateProductButton  createproductbutton=new CreateProductButton(driver);
		createproductbutton.clickOnCreateProductButton();
		
		
	
//		driver.findElement(By.name("user_name")).sendKeys(User);
//		driver.findElement(By.name("user_password")).sendKeys(Pwd);
//		driver.findElement(By.id("submitButton")).click();
		
//		driver.findElement(By.linkText("Products")).click();
//		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
//		Random ra=new Random();
//		int ranNum=ra.nextInt();
		
		int RanNum=j.getRandomNum();
		Excel_utility e=new Excel_utility();
		String s= e.getExcelData("Organization", 1, 0)+RanNum;
		
//		FileInputStream fis1=new FileInputStream("./Book1.xlsx"); 
//		Workbook wb = WorkbookFactory.create(fis1);
//		Sheet sh = wb.getSheet("Organization");
//		
//		Row r= sh.getRow(2);
//		Cell cel = r.getCell(0);
//		String orgName = cel.getStringCellValue()+RanNum;
//		System.out.println(orgName);
		
		
		
//		driver.findElement(By.name("productname")).sendKeys(s);
//		
//		driver.findElement(By.name("button")).click();
		CreateProductPage createproductpage=new CreateProductPage(driver);
		createproductpage.createProductTxtField(s);
		createproductpage.ProductSaveButton();
		
		ProductValidation actualProductName=new ProductValidation(driver);
		String actualProductData = actualProductName.actualProductName();
		Assert.assertEquals(actualProductData.contains(s),true);
		
//		String actualdata = driver.findElement(By.className("lvtHeaderText")).getText();
//		
//		if(actualdata.contains(s))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		
		DeleteProduct deleteproduct=new DeleteProduct(driver);
		deleteproduct.deleteProductIcon();
		
//		driver.findElement(By.name("Delete")).click();
		wlib.switchToAlertAndAccept(driver);
//		Alert alrt = driver.switchTo().alert();
//		alrt.accept();
		
		WebElement admin = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(admin).perform();
		homepage.clickOnSignOutButton();
		
//		driver.findElement(By.partialLinkText("Sign ")).click();
	}
}
