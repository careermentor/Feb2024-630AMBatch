package org.wipro.automation.fb.baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.fb.utilitiesClass.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitiateBrowser {

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(Utilities.readConfigProp("BrowserName").equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		else if(Utilities.readConfigProp("BrowserName").equalsIgnoreCase("chrome"))
		
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();   ///launch your chrome browser
		}
		
		else if(Utilities.readConfigProp("BrowserName").equalsIgnoreCase("firefox"))
			
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();   ///launch your firefox browser
		}
		
		else
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();   ///launch your chrome browser
		}
			
		
		driver.get(Utilities.readConfigProp("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	
	
}
