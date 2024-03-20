package org.wipro.automation.fb.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.fb.dataGenerator.TestDataGenerator;
import org.wipro.automation.fb.pages.LoginPage;
import org.wipro.automation.fb.utilitiesClass.Utilities;

public class LoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="static",dataProviderClass=TestDataGenerator.class)
	public void validate_loginFunctionailty(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
	}
	
	
	
}
