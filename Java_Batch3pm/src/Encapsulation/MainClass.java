package Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ATM obj=new ATM();
		obj.setaccountno(234567L);
		obj.SetPinno(2345);
		obj.SetBalance(2000);
		
		
	//int enteredpin=2345;
		
		
	
		if(2345==obj.GetpinNo())
		{
			
			
			System.out.println("Accountblance : "+obj.Getbalance());
		}
		else
		{
			
			System.out.println("Invalid pin");
		}
		

	}

}
