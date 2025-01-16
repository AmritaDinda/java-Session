package Oop_inheritance;

public class Car extends Vehicle {
	
	//final :
	//is used to prevent inheritance
	//is to prevent method overridden
	//to use for constant values
	
	public void start() {
		System.out.println("car - start");
	}
	public void stop() {
		System.out.println("car - stop");
	}
	
	public static void billing() {
		System.out.println("car - billing");
	}
	
	private void pickcolor() {
		System.out.println("car - pickcolor");
	}
	
	public final void service() {
		System.out.println("car - service");
	}
	public void refuel() {
		System.out.println("car - refuel");
	}

}
