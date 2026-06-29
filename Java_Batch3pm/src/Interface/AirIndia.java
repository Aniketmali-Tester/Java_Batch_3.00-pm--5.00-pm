package Interface;

public class AirIndia implements FlightServiceProvider{

	@Override
	public void getserviceName() {
		System.out.println("Welcome to our AirIndia Service");
		
	}

	@Override
	public void bookticket(int qty) {
		    double price=2500;
		    System.out.println("Total Price :"+(price*qty));
		
	}

}
