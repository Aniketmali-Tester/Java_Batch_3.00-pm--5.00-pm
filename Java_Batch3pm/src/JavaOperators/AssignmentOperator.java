package JavaOperators;

public class AssignmentOperator {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Assingment operator
		int a=10;
		int b=20;
		int c=30;
		int d=20;
		int e=5;
		int f=8;
		System.out.println("Assignment operator is : "+a);//10
		
		
		//Additional and assignment
		a=a+b;
		System.out.println("Additional and assignment value a is : "+a);//30
		
		
		
		a+=b;
		System.out.println("Additional and assignment value is : "+a);//50
		
		
		//Subraction and Assignment Operator
		//b=b-a;
		//System.out.println("Subraction and Assignment operator 1 value is : "+b);//-30
		
		b-=a;
		System.out.println("Subraction and Assignment operator : "+b);//-80
		
		
		//Multiplication And assignment
		c*=a;
		System.out.println("Multiplication and assignment operator : "+c);//1500  c+c
		
		b*=c;
		System.out.println("Multiplication and assignment operator : "+b);//-`12000
		
		a*=b;
		System.out.println("Multiplication and assignment operator : "+a);//-6000000
		
		
		//Division and Assignment
		
		d/=e;
		System.out.println("Division and Assignment : "+d);//4
		
		//Modulus and Assignmment
		d%=f;
		System.out.println("Modulus and Assignment : "+d);//1
		

	}

}
