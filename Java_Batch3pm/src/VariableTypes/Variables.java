package VariableTypes;

public class Variables {
	
	
	
	
   //class variables
	static String name="John";
	 static String des="Tester";
	static double sal=123;
	static String Comapnyname="Accel";
	
	
	
	//Instance Variable
	String bikeModel="FZ";
	String Bikecompany="Yamaha";
	String Colour="grey";
	int mileage=50;
	double price=180000;
	
	
	void bikedetails()
	{
		
		System.out.println(Bikecompany);
		System.out.println(bikeModel);
		System.out.println(Colour);
		System.out.println(mileage);
		System.out.println(price);
	}
	
	
	
	
	
	
	String Bankname;
	String Branch;
	
	
	void accountdetails(long accountno,String name,double openingamount)
	{
		
		Bankname="SBI";
		Branch="Chennai";
		
		
		
		System.out.println("Welcome to our "+Bankname+" "+"Bank");
		System.out.println("Welcome to our "+Branch+ "Branch");
		
		System.out.println(accountno);
		System.out.println(name);
		System.out.println(openingamount);
		
		
		System.out.println("====================================================");
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Variables obj=new Variables();
		obj.accountdetails(234567, "Arun", 20000);
		
		
		System.out.println("===============================================================");
		obj.bikedetails();
		
		
		
		
		
	}

}
