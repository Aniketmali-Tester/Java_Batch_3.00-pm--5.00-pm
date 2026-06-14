package JavaOperators;

public class UnaryOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int p=4;//5
		int q=6;
		
		
		
		System.out.println("The p value is : "+p);//4
		System.out.println("The Q value is : "+q);//6
		
		
		//4+1
		p++;
		System.out.println("After P value  Increment : "+p);//5
		--p;
		
		System.out.println("After P value  Decrement : "+p);//4
		
		
		
		q=p;
		
		System.out.println("After Re-intilization  q value is  "+q);//4
		
		
		q=p++ + q;//10
		System.out.println("Again Q value is : "+q);
		

	}

}
