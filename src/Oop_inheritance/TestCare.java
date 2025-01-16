package Oop_inheritance;

public class TestCare {

	public static void main(String[] args) {

		BMW ob = new BMW();
		ob.start();// overridden
		ob.stop();// inherited //BMW can take the properties of car
		ob.refuel();// inherited
		ob.autoparking();// individual
		ob.petrolEngine();
		BMW.billing();

		System.out.println("----------");

		Car oc = new Car();
		oc.start();
		oc.stop();
		oc.refuel();
		oc.petrolEngine();
		// oc.autoparking(); //car couldn't take the properties of BMW
		Car.billing();

		System.out.println("----------");

		// child class object can be referred by parent class reference variable :
		// Top/up casting : can access only overridden and inherited method
		Car b1 = new BMW();
		b1.start();
		b1.refuel();
		// b1.autoparking();//not allowed for individual method -- reference type check is
		// failed

		// child class object can be referred by grandparent class reference variable :
		Vehicle b2 = new BMW();
		b2.petrolEngine();
		b2.thefsafty();
		// b2.autoparking(); //not allowed for individual method -- reference type check is
		// failed

		// down casting :
		// parent class object can be referred by child class reference variables :
		// BMW q1 = new Car();// ClassCastException
		// BMW q1 = new Vehicle();// ClassCastException

	}

}
