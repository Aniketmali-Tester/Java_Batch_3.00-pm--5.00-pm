package JavaOperators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Syntax::
 
                   Variable=(conditions...n)? "exp1 " : "exp2";

                                                if        else*/
		
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = Scan.nextInt();
		
		
		String result = (number>0)?"Positive number":"Negative number";
		System.out.println(result);
		
 


	}

}
