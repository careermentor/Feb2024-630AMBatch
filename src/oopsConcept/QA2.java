package oopsConcept;

public class QA2 extends QA1
{

	public void callVar()
	{
		int x = 500;
		System.out.println(x); //500
		System.out.println(super.x); //100
		
		super.sum(20, 30);
	}
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
		
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("substraction of a&b: " + c);
	}
	
	public static void main(String[] args) {
		
		QA2 q2 = new QA2();
		q2.sub(30, 10);
		q2.sum(20, 30);
		q2.callVar();
	}


	

	
	
	
}
