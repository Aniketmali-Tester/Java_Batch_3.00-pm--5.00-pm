package MethodOveriding1;

import java.util.Scanner;

public class MainTelecom {
	
	public static void main(String [] args) {

		Airtel a=new Airtel();
		jio j=new jio();
	Scanner scan=new Scanner(System.in);
	System.out.println("Select type of recharge");
	System.out.println("1.Prepaid");
	System.out.println("2.Postpaid");
	String type = scan.next();
	
	System.out.println("Select Service provider");
	System.out.println("1.Airtel");
	System.out.println("2.jio");
	String Service = scan.next();
	
	
	
	if(Service.equalsIgnoreCase("Airtel"))
	{
		 a=new Airtel();
		
		
		if(type.equalsIgnoreCase("prepaid"))
		{
			System.out.println("Select prepaid plan");
			System.out.println("1.199 \t 2.299");
			int plan = scan.nextInt();
			a.recharge(type, plan);
			
			
		}
		
		else if(type.equalsIgnoreCase("postpaid"))
		{
			System.out.println("Select postpaid plan");
			System.out.println("1.399 \t 2.499");
			int plan = scan.nextInt();
			a.recharge(type, plan);
				
		}
		else if(Service.equalsIgnoreCase("jio"))
		{
			j=new jio();
			
			if(type.equalsIgnoreCase("prepaid"))
			{
				System.out.println("Select prepaid plan");
				System.out.println("1.299 \t 2.399");
				int plan = scan.nextInt();
				a.recharge(type, plan);
				
				
			}
			
			else if(type.equalsIgnoreCase("postpaid"))
			{
				System.out.println("Select postpaid plan");
				System.out.println("1.499 \t 2.599");
				int plan = scan.nextInt();
				a.recharge(type, plan);
					
			}
			
			
			
		}
	}
	

}
	
}
