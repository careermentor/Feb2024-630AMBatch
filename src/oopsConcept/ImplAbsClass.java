package oopsConcept;

public class ImplAbsClass extends AbsClassDemo
{

	
	public void meth2()
	{
		System.out.println("this is my test case 1");
		
	}
	
	public void meth3() 
	{
		
		System.out.println("this is my test case 2");
	}
	
	public static void main(String[] args) 
	{
	
		ImplAbsClass imp = new ImplAbsClass();
		imp.meth2();
		imp.printdata();
		imp.meth3();
	}

	
	public void meth4() {
		// TODO Auto-generated method stub
		
	}

	
	

}
