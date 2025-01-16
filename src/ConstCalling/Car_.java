package ConstCalling;

public class Car_ {
	
	String name;
	int price;
	
	public int min_speed = 100;
	
	public void display() {
		System.out.println("Car--display");
	}
	
	public Car_(String name, int price) {
		System.out.println(name + " "+price);

		this.name = name;
		this.price = price;
	}

	public Car_() {
		System.out.println("Car const...");
	
	}
	
	
	

}
