package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.fb.pages.LoginPage;
import org.wipro.automation.fb.pages.UO_HomePage;
import org.wipro.automation.fb.utilitiesClass.Utilities;

public class UO_HomePage_Scenario extends InitiateBrowser
{

	@Test
	public void validate_allthemenu_homepage() throws Exception
	{
		UO_HomePage hp = new UO_HomePage(driver);
		
		hp.check_thingsToDo();
		
	}
	
}
