package JavaOperators;

import java.util.Scanner;

public class TernaryOperator1 {

	public static void main(String[] args) {
		
		
		//Select colour
		//1) Red 2)Green 3)Blue
		
		//Choice 
		//msg
		//Without using if -else
		
		
		
		Scanner Scan=new Scanner(System.in);
		System.out.println("Please Select a colour");
		System.out.println("1.Red /n 2.Green /n 3.Blue");
		int  choice = Scan.nextInt();
		
		
	    String result =(choice==1)?"Red":(choice==2)?"Green":(choice==3)?"Blue":"Invalid";
	    System.out.println("You Selected colour is : "+result);

	}

}
