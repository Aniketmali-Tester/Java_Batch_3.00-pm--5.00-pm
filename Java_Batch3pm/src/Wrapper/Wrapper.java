package Wrapper;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Java";
		String s1=new String("Java");
		
		String s2="10";
		String s3="20";
		
		//System.out.println("Before Parse : "+s2+s3);
		
		
		//Convert String value into Integer
		
               int s4 = Integer.parseInt(s2);
               int s5=Integer.parseInt(s3);
               
               
              // System.out.println("After Parse : "+(s4+s5));
               
               
               //Convert String into double
              double s6 = Double.parseDouble(s2);
              double s7 = Double.parseDouble(s3);
              
              
              //System.out.println(s6+s7);
              
              
              String b="true";
             // System.out.println(Boolean.parseBoolean(b));
              
              
              //Convert String value into char
              String c="java";
              
              
              
              //convert double into string
              
              System.out.println("Before Convert Double to string values : "+(s6+s7));
              
              
               String s8 = String.valueOf(s6);
               String s9=String.valueOf(s7);
               
               
               System.out.println("Before Convert Double to string values : "+s8+" "+s9);
               
               
               

	}

}
