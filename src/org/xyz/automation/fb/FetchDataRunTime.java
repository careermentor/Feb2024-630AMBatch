package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRunTime {

	WebDriver driver;
	@Test
	public void launchBrowser() throws Exception
	{
		driver= new ChromeDriver();   ///launch your chrome browser
			
		String ExpURL = "https://www.facebook.com/";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL);  //fail   ---hard assertion - stop executing code here
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL); 
		
		System.out.println("this step executed successfully");
		
		String ExpTitle="Facebook – log in or sign up";
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		sa.assertEquals(ActTitle, ExpTitle);
		
		String ExpUnameField = "Email address or phone number";
		String ActUnameField = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUnameField);
		sa.assertEquals(ActUnameField, ExpUnameField);
		
		String ExpLoginBtn = "Log in";
		String ActLoginbtn = driver.findElement(By.name("login")).getText();
		System.out.println(ActLoginbtn);
		sa.assertEquals(ActLoginbtn, ExpLoginBtn);
		
		Point loginLoc = driver.findElement(By.name("login")).getLocation();
		System.out.println(loginLoc);
		System.out.println(driver.getPageSource());
		
		
		driver.close();
		
		sa.assertAll();
	}

}
