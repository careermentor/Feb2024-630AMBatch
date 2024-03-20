package org.wipro.automation.fb.dataGenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="static")
	public Object[][] testdata()
	{
		
	//	Object[] data1 = {"user1","pass1"}; //1-D array
		Object[][] data2 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}}; //2-D array
		return data2;
	}
	
}
