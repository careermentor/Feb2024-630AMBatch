package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilitiesClass.Utilities;

public class SignupPage 
{
	WebDriver driver;  //global

	public SignupPage(WebDriver driver) //local
	{
		this.driver=driver;
	}
	
	public void click_createnewaccount() throws Exception
	{
		driver.findElement(By.xpath(Utilities.readElementProp("fb_login_createnewaccount_xpath"))).click();
	}

	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(Utilities.readElementProp("fb_signup_firstname_name"))).sendKeys(fname);
	}
	
	
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(Utilities.readElementProp("fb_signup_signupbttn_name"))).click();
	}
	
}
