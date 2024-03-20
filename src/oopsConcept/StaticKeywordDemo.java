package oopsConcept;

public class StaticKeywordDemo 
{
	
	static int a = 30;

	public static void meth1()
	{
		
		System.out.println("this is method1");
		System.out.println(a);
	}
	
	public  void meth2()
	{
		System.out.println("this method do not have static ");
	}
	
	
	public static void main(String[] args)
	{
	
		//StaticKeywordDemo abc = new StaticKeywordDemo();
		
		StaticKeywordDemo.meth1();
		///StaticKeywordDemo.meth2();
		
		StaticKeywordDemo abc = new StaticKeywordDemo();
		abc.meth2();
		
	}
}
