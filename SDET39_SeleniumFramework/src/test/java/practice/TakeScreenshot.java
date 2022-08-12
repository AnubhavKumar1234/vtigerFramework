package practice;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtilities.BaseClass;

public class TakeScreenshot extends BaseClass {

	@Test
	public void screenShot() throws Throwable 
	{

		
		TakesScreenshot takesscreenshot=(TakesScreenshot)driver;
		
        File RAM=takesscreenshot.getScreenshotAs(OutputType.FILE);
		
		//step3: specify the location
		
		File dest=new File("./Photo/vtiger.png");
		
		//step4 copy paste from ram to required  location
		FileUtils.copyFile(RAM, dest);
		driver.close();
		
		

	}

}
