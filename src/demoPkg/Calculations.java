package demoPkg;

 public class Calculations 
{

	 String name = "Java";  //global variable
	
	
	public int add()
	{
		String name = "selenium";  //local variable 
		
		final int a = 50;   //constant
		//a = 100;
		int b = 30;
		b=50;
		int c = a+b;
		
		//System.out.println(c);
		System.out.println("this is sum of a&b: " + c );
		System.out.println(a+b);
		
		System.out.println(name);
		
		return c;
		
	}
	
	
	public String printName()
	{
		String name = "Constructor";
		
		System.out.println(name);
		return name;
		
	}
	
	
	public static void main(String[] args) 
	{
	
		Calculations cal = new Calculations();
		
		cal.add();
		cal.printName();
	}
	
}
