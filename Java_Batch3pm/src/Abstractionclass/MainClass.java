package Abstractionclass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student obj;
		
		obj=new EngineeringStudent();
		obj.studentname="Rahul";
		obj.rollno=621516114031L;
		obj.percentage=86.5F;
		obj.studentinfo();
		obj.calculateScholarship();
		
		
		
		System.out.println("==================================");
		obj=new MBAStudent();
		obj.studentname="Rohit";
		obj.rollno=62151511034L;
		obj.percentage=81.4F;
		obj.studentinfo();
		obj.calculateScholarship();
		

	}

}
