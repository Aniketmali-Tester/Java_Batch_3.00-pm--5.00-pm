package Abstraction;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Switch s;
           s=new Fan();
           s.Switchon();
           s.Switchoff();
           
           System.out.println("=====================================");
           
           
           s=new Tv();
           s.Switchon();
           s.Switchoff();
           
           
	}

}
