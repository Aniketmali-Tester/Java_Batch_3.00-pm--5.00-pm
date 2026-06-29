package Interface;

public class Indigo implements FlightServiceProvider {

	@Override
	public void getserviceName() {
		System.out.println("Welcome to our Indigo Service");
		
	}

	@Override
	public void bookticket(int qty) {
		
		double price=2000;
		System.out.println("Total price : "+(qty+price));
		
	}

}
