package MethodOverloading;

public class Employee {

	
	       //Developer salary
			public void Salary(String des,double sal)
			{
				
	                  System.out.println("The Designation is  : "+des);
	                  
	                  System.out.println("The salary is  : "+sal);
	                  
				
			}
			
			
			//Tester salary
			public void Salary(String des,float sal)
			{
			
		     
			System.out.println("The Designation is : "+des);
			
			System.out.println("The salary is  : "+sal);
			
			//System.out.println("The company  is  : "+comp);
			}
			
			
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				
				
				Employee e=new Employee();
				e.Salary("Developer", 50000);
				e.Salary("Tester", 40000);
				
			}

}
