package JavaOperators;

public class Unaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10;
		a=a++;
		
		//post increment
		System.out.println("After Post Increment :" +(a++));//10+1
		System.out.println("After post increment : "+a);//11
		
		//pre Increment
		//System.out.println("Before Pre Increment : "+a);//11
		System.out.println("After pre increment : "+(++a));//12
		
		//again post increment
		System.out.println("Again post increment "+(a++));//12
		System.out.println("Again post increment "+a);//13
		
		
		//post Decrement 
		
		System.out.println("Before post Decrement : "+(a--));//13
		System.out.println("After Post Decrement : "+a);//12
		
		//pre Decrement 
		System.out.println("Before pre Decrement : "+(--a));//11
		System.out.println("After pre Decrement : "+a);//11

	}

}
