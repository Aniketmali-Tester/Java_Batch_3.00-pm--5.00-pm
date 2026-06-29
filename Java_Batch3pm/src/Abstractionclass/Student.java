package Abstractionclass;

public abstract class Student {
	
	//Declare Instance Variable
	String studentname;
	long rollno;
	float percentage;
	
	
	
	//Abstract Method
	abstract void calculateScholarship();
	
	
	//Concrete Method
	void studentinfo()
	{
		
		System.out.println("Student name"+studentname);
		System.out.println("rollno "+rollno);
		System.out.println("Student name"+percentage);
	}

}
