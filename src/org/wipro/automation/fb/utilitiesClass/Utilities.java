package org.wipro.automation.fb.utilitiesClass;

import java.io.FileReader;
import java.util.Properties;

public class Utilities 
{

	public static String readConfigProp(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties pr = new Properties();
		
		pr.load(fr);  //full data going to load into memory
		
		return pr.get(key).toString();
	}
	
	public static String readElementProp(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		
		Properties pr = new Properties();
		
		pr.load(fr);  //full data going to load into memory
		
		return pr.get(key).toString();
	}
	
}
