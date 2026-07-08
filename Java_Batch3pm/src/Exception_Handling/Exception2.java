package Exception_Handling;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Requirement 
		/*1.User the card balance and travel fare.
		 * 2.create a travel() method with throws Exception.
		 * 3.If balance is less than fare ,throw an exception
		 * 4.otherwise,deduct the fare and disply the remanining bla
		 * 5.Handle the exception using try-catch-finally
		 */
                
		int cardbalance=100;
		int travelfare=150;
		
		
		try {
			subclass.travel(cardbalance, travelfare);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Thank you");
		}
		
	}

}
