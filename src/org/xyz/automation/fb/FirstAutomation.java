package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation {

	WebDriver driver;
	
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test
	public void loginFunctionality()
	{
		
		
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("passs@1234");
		
		driver.findElement(By.cssSelector("[data-testid='royal_login_button']")).click();
		
		
		
	}
	

	@Test
	public void signupFunctionality() throws Exception
	{
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Male']")).isEnabled()); //false
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Male']")).isEnabled());  //true
		
		System.out.println(driver.findElement(By.xpath("//button[@name='websubmit']")).isEnabled());  //true
		
		System.out.println(driver.findElement(By.xpath("//button[@name='websubmit']")).isDisplayed()); 
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	
		
	}
	
	
	public static void main(String[] args) throws Exception 
	{
		FirstAutomation fa = new FirstAutomation();
		fa.loginFunctionality();
		fa.signupFunctionality();

	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		//WebDriverManager.chromedriver().setup();
		
		
		driver= new ChromeDriver();   ///launch your chrome browser
				
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		
	}

}
