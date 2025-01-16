package ConstCalling;

public class BMW_ extends Car_ {

	private int min_speed = 200;

	public void speedCall() {
		System.out.println(min_speed);// BMW

		int CarSpeed = super.min_speed;// Car
		int diff = min_speed - CarSpeed;
		System.out.println(diff);
	}

	@Override
	public void display() {
		System.out.println("BMW--display");
		super.display();
	}

	public BMW_() {
		super("BMW X1", 400);
		System.out.println("BMW const.....");
	}

	public BMW_(int price) {
		super("Audi", 500);
		System.out.println("BMW const....." + price);
	}

}
//to call parent class const..,variables,method use super keyword
//to call Current class const.. use this keyword
//can't use super keywords in interface,abstract because interface is always static ,final in nature and super keyword do not excess



