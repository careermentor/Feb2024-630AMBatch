package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.fb.pages.LoginPage;
import org.wipro.automation.fb.utilitiesClass.Utilities;

public class LoginScenario extends InitiateBrowser
{

	@Test(enabled=false)
	public void validate_loginFunctionailty() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
		
	}
	
	@Test
	public void validate_loginFunctionailtytd() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(Utilities.readConfigProp("Username"));
		login.enter_password(Utilities.readConfigProp("Password"));
		login.click_loginbttn();
		
	}
	
}
