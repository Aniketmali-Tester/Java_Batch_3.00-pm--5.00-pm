package Exception_Handling;

public class subclass {
	
	
	//Requirement 
			/*1.User the card balance and travel fare.
			 * 2.create a travel() method with throws Exception.
			 * 3.If balance is less than fare ,throw an exception
			 * 4.otherwise,deduct the fare and disply the remanining bal
			 * 5.Handle the exception using try-catch-finally
			 */
	
	
	        public static void travel(int Cardamt,int fareamt) throws Exception
	        {
	        	
	        	if(Cardamt<=0)
	        	{
	        		
	        		throw new Exception("Card balance is zero.Please recharge");
	        	}
	        	
	        	else if(fareamt>Cardamt)
	        		
	        	{
	        		throw new Exception("Insufficient balance ");
	        		
	        	}
	        	
	        	
	        int balance = Cardamt-fareamt;
	        
	        System.out.println("Remaning Balance : "+balance);
	        }

}
