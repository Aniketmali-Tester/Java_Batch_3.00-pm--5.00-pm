package Abstraction;

public class Tv implements Switch {

	@Override
	public void Switchon() {
		System.out.println("Switch on Tv");
		
	}

	@Override
	public void Switchoff() {
		System.out.println("Switch off Tv");
		
	}

	
	
}
