package controlstatement;

public class NestedIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String username="Aniket";
		String Password="1234";
		
		
		if(username.equalsIgnoreCase("aniket"))
		{
			if(Password.equals("1234"))
			{
				
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Invalid Password");
			}
			
		}
		else
		{
			
			System.out.println("Invalid Username");
		}

	}

}
