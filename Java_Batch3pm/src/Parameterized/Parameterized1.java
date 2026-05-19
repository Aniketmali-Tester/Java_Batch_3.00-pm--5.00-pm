package Parameterized;

public class Parameterized1 {
	
	
	//External + static method +Non-parameterized
	public static void Showroom()
	{
		
		
		System.out.println("Welcome to Apple showroom");
	}
	
	
	//External + non-static +parameterized
	public void ProductDetails(String productname,Double price,int ram)
	{
		Showroom();
		System.out.println("The Productname is : "+productname);
		System.out.println("The product price is  : "+price);
		System.out.println("The ram is :" +ram);
		System.out.println("========================================");
		
		
	}
	
	
	//External + non static method + parameterized
	public void Deliverytime(String time,String date,String location)
	{
		
		System.out.println("The Deliver time & Date : "+time + " And " +date );
		System.out.println("The Deliver Location is : "+location);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Parameterized1 p=new Parameterized1();
		p.ProductDetails("Mobilephone", 25000.0, 8);
		p.Deliverytime("12-05-2026", "Thursday", "Chennai");
		
		
	
	  
	
		
		
		
		
		

	}

}
