package Interface;

public class MainFlightprovider {

	public static void main(String[] args) {
		
		
		
		FlightServiceProvider provider;
		
		
		
		provider=new AirIndia();
		provider.getserviceName();
		provider.bookticket(4);
		
		System.out.println("====================================================");
		
		provider=new Indigo();
		provider.getserviceName();
		provider.bookticket(5);
		
		/*//create object 
		AirIndia obj=new AirIndia();
		obj.getserviceName();
		obj.bookticket(5);
		
		
		
		System.out.println("========================================");
		
		
		
	      Indigo obj1=new Indigo();
	      obj1.getserviceName();
	      obj1.bookticket(4);*/
			
			

	}

}
