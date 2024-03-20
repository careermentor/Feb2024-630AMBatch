package demoPkg;

public class Calculation 
{
	String name ="java";
	
	//method is without input/parameter/argument
	public int add()
	{
		int a=20;
		int b=30;
		int c = a+b;
		System.out.println("addition of a&b: " + c);
		return c;
		
	}
	
	//method is with input/parameter/argument
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		
		return c;
		
	}
	
	public Calculation(int a, int b)
	{
		//System.out.println("this is a constructor");
		int c = a+b;
		System.out.println("addition of a&b: " + c);
		
	}
	
	public Calculation()
	{
		int a = 60;
		int b = 70;
		int c = a+b;
		System.out.println("addition of a&b: " + c);
		
	}
	
	public static void main(String[] args) 
	{
	
		Calculation cal = new Calculation(40,50);  //constructor will be called automatically
		cal.sum(30, 40);
		cal.add();
		
		Calculation cal1 = new Calculation();
		
		System.out.println(cal1.name);
		
	}
	
}
