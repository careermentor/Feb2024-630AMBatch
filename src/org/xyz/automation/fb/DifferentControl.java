package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentControl {

	WebDriver driver;
	
	
	@Test
	public void launchBrowser() throws Exception
	{
		
		driver= new ChromeDriver();   ///launch your chrome browser
				
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("fld_username")).sendKeys("Selenium");
		
		driver.findElement(By.name("fld_username")).clear();
		
		driver.findElement(By.name("fld_username")).sendKeys("Java");
		
		WebElement x = driver.findElement(By.cssSelector("[value='home']"));
		
		x.click();
		
		int a=20;
		
		System.out.println(a);
		
		System.out.println(20);
		
		WebElement y = driver.findElement(By.name("sex"));
		
		Select gen = new Select(y);
		//gen.selectByIndex(1);
		//gen.selectByValue("2");
		//gen.selectByVisibleText("Male");
		gen.selectByVisibleText("Female");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		///wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		st.selectByVisibleText("Arizona");
		
		
		
		driver.findElement(By.name("terms")).click();
		
		//driver.findElement(By.className("displayPopup")).click();
		
	}

}
