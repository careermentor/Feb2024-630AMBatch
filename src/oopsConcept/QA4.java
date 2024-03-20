package oopsConcept;

public class QA4 implements QA3I
{

	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("division of a&b: " + c);
	}
	
	public static void main(String[] args) {
		
		QA4 q4 = new QA4();
		q4.div(40, 20);
		//q4.sub(30, 10);
		//q4.sum(20, 30);
		
	}

	@Override
	public void QA3IM() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void QA1IM() {
		// TODO Auto-generated method stub
		
	}

	
	
}
