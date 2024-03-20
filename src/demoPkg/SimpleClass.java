package demoPkg;

public class SimpleClass 
{
	
	
	
	
	public int sum(int a, int b)
	{
		
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		return c;
		
	}
	
	

	
	
	public static void main(String[] args) 
	{
		
		String lang = "java";
		
		System.out.println(lang);
		System.out.println("Welcome Java main method");
		
		//System.out.println(a);
		
		SimpleClass sc = new SimpleClass();
		sc.sum(20, 40);
		int x = sc.sum(30, 40);
		sc.sum(x, 50);

	
	}

	
	
	
	
	
	
	
	
	
	
	
}