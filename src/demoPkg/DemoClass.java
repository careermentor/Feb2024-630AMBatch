package demoPkg;

public class DemoClass 
{

	//these are different data types in java
	
	float y=10.5f;
	
	String z = "Java";
	
	char v = 'A';
	
	boolean u = true;

	int x = 20;
	
	public int printdata()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(u);
		System.out.println(v);
		
		return x;
	}
	
		
	public static void main(String[] args) 
	{
		DemoClass abc = new DemoClass();
		
		abc.printdata();
		
		System.out.println(abc.y);
		
	}


	
	
}
