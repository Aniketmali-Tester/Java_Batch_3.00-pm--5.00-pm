package JavaOperators;

import java.util.Scanner;

public class Reservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int 	availableseats=45;
	  
	  //Scanner class
	    Scanner Sc=new Scanner(System.in);
	    
	    System.out.println("Enter a Passenger age");
	    int age = Sc.nextInt();
	    
	    System.out.println("Please Enter a requested Seats");
	    int seats = Sc.nextInt();
	    
	    
	    if(age>=18 && seats<availableseats)
	    {
	    	
	    	System.out.println("Confirmation Reservation");
	    	int remainingseats= availableseats-seats;
	    	System.out.println("Passenger age : "+age);
	    	System.out.println("Booked Seats : "+seats);
	    	System.out.println("Remainigseats : "+remainingseats);
	    	
	    }
	    else
	    {
	    	
	    	System.out.println("Reservation Failed");
	    }
	    
	  

	}

}
