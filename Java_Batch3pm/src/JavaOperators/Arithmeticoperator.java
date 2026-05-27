package JavaOperators;

public class Arithmeticoperator {
	
	
	
	
	/* WAP to calculate the final shopping bill using arithmetic operators?
	 *Requirement
	 *1.Product Price
	 *2.Quantity
	 *3.Discount
	 *4.GST  
	 * 
	 * 
	 * */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int productprice=3000;
		int quantity=5;
		int Discount=500;
		int gst=200;
		
		//Multiplicator operator
		
		     int totalamount = productprice*quantity;
		     System.out.println("Total Amount is : "+totalamount);
		     
		     
		     //Subraction operator
		     
		   double Discountamt =totalamount-Discount;
		   System.out.println("After Discount amount is : "+Discountamt);
		     
		
		    //Additional operator
		    double finalamt = Discountamt+gst;
		    System.out.println("Final amount is : "+finalamt);
		    
		    //split use Division operator
		    double splitamount = finalamt/2;
		    System.out.println("Splitamount is : "+splitamount);
		    
		     
		     
		     
		     
		
		
		
		
		
		
		
		
		
		
		

	}

}
