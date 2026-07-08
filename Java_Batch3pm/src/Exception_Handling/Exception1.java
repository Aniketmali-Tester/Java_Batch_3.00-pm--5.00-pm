package Exception_Handling;

public class Exception1 {

	public static void main(String[] args) {
		
		
		String username=null;
		String password="admin123";
		
		
		
		
		System.out.println("Database Connection Opened");
		
		
		try {
			System.out.println(username.length());
			
			if(username.equals("admin") && password.equals("admin123"))
		{
			
			System.out.println("Login successful");
			
		}
		else
		{
			
			System.out.println("Invalid usename or password");
		}
		}catch(Exception e)
		{
			
			System.out.println(e);
		}
		
		finally 
		{
			System.out.println("Thank you Visit again");
		}
		
		

	}

}
