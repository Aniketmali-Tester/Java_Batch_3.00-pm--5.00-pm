package Switchcase;
import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Scanner scan=new Scanner(System.in);
		
		
		String city="chennai";
		
		/*if(city=="Chennai")
		{
			
			System.out.println("Welcome to chennai");
		}
		else
		{
			
			System.out.println("Invalid city");
		}
		
		
		  /*switch(Expression)
        {
              case1:
                     -----
                     -----
                     -----
                     break;
          
               case2:
                      
                       ----
                       ----
                       ----
                       break;
                 
                 default:
         
         }*/

		switch(city)
		{
		  case "chennai":
		
		        System.out.println("Welcome to chennai");
		        break;
		        
		  case "Bengaluru":
		         
		     System.out.println("Welcome to Bengaluru");
	         break;
	         
		  case "mumbai":
				
		        System.out.println("Welcome to mumbai");
		        break;
		        
		  case "coimbatore":
		         
		     System.out.println("Welcome to coimbatore");
	         break;

	         default :
	        	 
	        	 System.out.println("Invalid city");
		  
		        
		}

	}

}
