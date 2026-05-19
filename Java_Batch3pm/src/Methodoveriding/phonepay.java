package Methodoveriding;

public class phonepay extends payment {
	
	@Override
	public void paymentdetails(double amount)
	
	{
		
		System.out.println("payment processing using phonepay");
		System.out.println("Pay amount in phone pay :"+amount);
		System.out.println("==============================================");
	}
			
	
	

}
