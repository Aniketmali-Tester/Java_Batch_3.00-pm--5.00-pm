package Abstraction;

public class Fan implements Switch{

	@Override
	public void Switchon() {
		System.out.println("Swithed on Fan");
		
	}

	@Override
	public void Switchoff() {
		System.out.println("Switche off fan");
		
	}

}
