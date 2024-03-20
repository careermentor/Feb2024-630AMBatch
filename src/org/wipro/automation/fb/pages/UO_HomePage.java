package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilitiesClass.Utilities;

public class UO_HomePage 
{
	WebDriver driver;  //global

	public UO_HomePage(WebDriver driver) //local
	{
		this.driver=driver;
	}

	public void check_thingsToDo() throws Exception
	{
		driver.findElement(By.xpath(Utilities.readElementProp("UO_home_thingstodo_xpath"))).click();
	}
	
	
}
