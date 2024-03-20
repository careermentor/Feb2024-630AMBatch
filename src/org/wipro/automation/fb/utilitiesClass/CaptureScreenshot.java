package org.wipro.automation.fb.utilitiesClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{

	
	
	public static void testResults(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;   //will take screenshot
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./Results/" + name+  ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
