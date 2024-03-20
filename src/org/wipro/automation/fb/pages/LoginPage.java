package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilitiesClass.Utilities;

public class LoginPage 
{
	WebDriver driver;  //global

	public LoginPage(WebDriver driver) //local
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(Utilities.readElementProp("fb_login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(Utilities.readElementProp("fb_login_password_name"))).sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(Utilities.readElementProp("fb_login_loginbttn_css"))).click();
	}
	
}
