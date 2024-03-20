package filehandling;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;

import java.util.Properties;



public class ReadWriteFile 
{
	
	public static void readProp() throws Exception
	{
		FileReader fr = new FileReader("./TestData/test.properties");
		
		Properties pr = new Properties();
		
		pr.load(fr);  //full data going to load into memory
		System.out.println(pr.get("automation"));
		
		System.out.println(pr.get("lang"));
		System.out.println(pr.get("url"));
	}

	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");  //make file connection
		//File f = new File("./TestData/abc.txt");
		//FileReader fr = new FileReader(f);
		
		FileReader fr = new FileReader("./TestData/abc.txt");
		
		int r = fr.read();
		
		
		while(r!=-1)
		{
			System.out.print((char)r);
			r=fr.read();
		}
	}		
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nthis is third line of the data");
		fw.flush();
		fw.close();
	}
		
		
	
	
	public static void main(String[] args) throws Exception {
		//ReadWriteFile.readdata();
		ReadWriteFile.writedata();
		ReadWriteFile.readProp();
	}
	
}
