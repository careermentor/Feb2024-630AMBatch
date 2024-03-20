package oopsConcept;

public class QA3 extends QA1
{

	
	public void mul(int a, int b)
	{
		int c = a*b;
		System.out.println("multiplication of a&b: " + c);
	}
	
	public static void main(String[] args) {
		
		QA3 q3 = new QA3();
		q3.mul(20, 30);
		//q3.sub(30, 10);
		q3.sum(20, 30);
	}
	
}
