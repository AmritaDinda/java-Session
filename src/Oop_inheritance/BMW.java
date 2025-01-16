package Oop_inheritance;

public class BMW extends Car {

	// method overridden: poly + morphism --> Run time (Dynamic)
	// when you have a method in parent class and the same method in child class
	// with the same name
	// with the same number of parameters
	// with the same sequence of parameters
	// with the same return

	@Override
	public void start() {
		System.out.println("BMW - start");
	}

	public void autoparking() {
		System.out.println("autoparking mode is on");

	}

	// method hiding : when you have a static method in parent and the same static
	// method in child class.
	// [ static method,private method,final ] can not be override
	public static void billing() {
		System.out.println("BMW - billing");
	}
	
//	private void pickolor() {
//		System.out.println("BMW - pickcolor");
//	}

	public void petrolEngine() {
		System.out.println("BMW - petrolEngine");
	}
}
