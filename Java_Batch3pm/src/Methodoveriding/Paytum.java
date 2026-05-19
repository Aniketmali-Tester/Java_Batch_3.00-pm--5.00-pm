package Methodoveriding;
public class Paytum extends payment {
	
	@Override
	public void paymentdetails(double amount)
	
	{
		
		System.out.println("payment processing using paytum");
		System.out.println("Pay amount in paytum :"+amount);
		System.out.println("==============================================");
	}

}
