package org.wipro.automation.fb.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.fb.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void validatefb_registration() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccount();
		sign.enter_firstname("Selenium");
		
		
		Select day=new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("10");
		
		
		
		sign.click_signupbttn();
		
		
	}
	
}
