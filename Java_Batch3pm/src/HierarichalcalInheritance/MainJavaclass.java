package HierarichalcalInheritance;

public class MainJavaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Mobile obj=new Mobile();
		obj.mobileinfo("Vivo");
		obj.sellproduct(5, 25000);
		
		
		System.out.println("******************************************************");
		Laptop obj1 =new Laptop();
		obj1.laptopinfo("Hp");
		obj1.sellproduct(5, 100000);
		

	}

}
