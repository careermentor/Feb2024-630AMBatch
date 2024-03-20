package demoPkg;

public class CallCal 
{
	
	public static void main(String[] args) 
	{
	
		Calculation cal = new Calculation(40,50);  //constructor will be called automatically
		cal.sum(30, 40);
		cal.add();
		
		Calculation cal1 = new Calculation();
		
	}

}
