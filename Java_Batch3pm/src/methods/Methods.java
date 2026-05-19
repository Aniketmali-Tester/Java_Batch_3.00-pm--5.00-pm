package methods;

public class Methods {
	
	
	static String employeename;
	static String  desgination;
	static int salary;
	
	
	//Static  method
	public static void companypolicy()
	{
		
		System.out.println("Company timing : 9 am to 6 pm");
		
	}
	
	//non static 
	public void emloyeedetails()
	{
		
		System.out.println("The Emp name is : "+ employeename);
		System.out.println("The Emp salary : "+salary);
		System.out.println("The Emp Designation "+desgination);
		System.out.println("============================================");
	}
	
	

	public static void main(String[] args) {
		
		
		//call static method
		companypolicy();
		
		
		
		//Creation a object for non static methods
				//Classname Referencevariablename=new Classname();
			
		
		
		Methods emp=new Methods();
		emp.employeename="Aniket";
		emp.desgination="QA Tester";
		emp.salary=45000;
		//emp.emloyeedetails();
		
		Methods emp2=new Methods();
		emp2.employeename="Rahima";
		emp2.desgination="Developer";
		emp2.salary=80000;
		//emp.emloyeedetails();
		
		Methods emp3=new Methods();
		emp3.employeename="jhansi";
		emp3.desgination="python Developer";
		emp3.salary=90000;
		//emp.emloyeedetails();
		
		
		Methods emp4=new Methods();
		emp2.employeename="Komathi";
		emp.desgination="senior Developer";
		emp.salary=100000;
		emp.emloyeedetails();
		
		
		
		
		
		
		
		
		
		
	}

}
