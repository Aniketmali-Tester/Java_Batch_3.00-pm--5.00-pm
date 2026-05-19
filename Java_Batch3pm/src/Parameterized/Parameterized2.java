package Parameterized;

public class Parameterized2 {
	
	int date=14-05-2026;

	//External method +static method 
	public static void showroom()
	{
		
		System.out.println("Welocme to RelainceDigital");
	}
	
	
	//External Method +non-static method+parameterized
	public void ProductInfo(String productname,double productprice,String processor)
	{
		showroom();
		System.out.println("The Productname is :" +productname);
		System.out.println("The product price is : "+productprice);
		System.out.println("The processor is : "+processor);
		System.out.println("======================================================");
		
	}
	
	//External method +non static +parameterized
	
	public void DeliverInfo(String date,String time,String location)
	{
		
		
		System.out.println("The product Delivery Date and time  : "+date +"  And "+time);
		System.out.println("The Deliver location is :"+location);
	}
	
	
	public void ProductInfo2(String productname,double productprice,String processor)
	{
		showroom();
		System.out.println("The Productname is :" +productname);
		System.out.println("The product price is : "+productprice);
		System.out.println("The processor is : "+processor);
		System.out.println("====================================================");
		
		
		
	}
	
	
	public void DeliverInfo2(String date,String time,String location)
	{
		
		
		System.out.println("The product Delivery Date and time  : "+date +"  And "+time);
		System.out.println("The Deliver location is :"+location);
	}
	
}
