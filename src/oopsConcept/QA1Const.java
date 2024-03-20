package oopsConcept;

public class QA1Const
{
	
	public QA1Const()
	{
		System.out.println("this is a constructor");
		int a = 20;
		
	}
	
	public QA1Const(int a)
	{
		System.out.println("this is a constructor");
		int b = 20;
		
	}
	
	public QA1Const(int a, int b)
	{
		System.out.println("this is a constructor");
		int c = 20;
		
	}

	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		return c;
	}
	
	public int sum1(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		return c;
	}
	
	public int sum2(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		return c;
	}
	
	public static void main(String[] args) {
		
		QA1Const q1 = new QA1Const();
		QA1Const q1a = new QA1Const(10);
		QA1Const q1ab = new QA1Const(10,20);
		
		q1.sum1(0, 0);
		q1.sum2(0, 0);
		q1.sum(20, 30);
	}
	
}
