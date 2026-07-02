package Encapsulation;

public class ATM {
	
	
	//private Variables
	private long AccountNo;
	private int PinNo;
	private double Balance;
	
	
	//Declare Getter and Setter Methods
	
	public void setaccountno(long Account)
	{
		
		AccountNo=Account;
		
	}
	
	
	public long getaccountno()
	{
		
		return AccountNo;
	}
	
	public void SetPinno(int pinno)
	{
		
		PinNo=pinno;
	}
	
	public int GetpinNo()
	
	{
		return PinNo;
		
		
	}
	
	public void SetBalance(double balance)
	{
		
		Balance=balance;
	}
    
	public double Getbalance()
	{
		
		return Balance;
	}
}
