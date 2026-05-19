package Methodoveriding;

public class Mainapyment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Googlepay gp=new Googlepay();
		gp.paymentdetails(50000);
		
		
		
		Paytum p=new Paytum();
		p.paymentdetails(50000);
		
		
		phonepay pp=new phonepay();
	    pp.paymentdetails(50000);

	}

}
