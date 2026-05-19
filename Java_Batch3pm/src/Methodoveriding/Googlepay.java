package Methodoveriding;

public class Googlepay extends payment{
	
	
	@Override
	public void paymentdetails(double amount)
	
	{
		
		System.out.println("payment processing using googlepay");
		System.out.println("Pay amount in google pay :"+amount);
		System.out.println("==============================================");
	}

}
