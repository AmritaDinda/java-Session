package javasession;

public class Car {
	String name;
	String car;
	int price;
	
	static final int wheel = 4;
	//static is a common property of all the object
	//but object will not hold the static property
	//Static var will be stored in the CMA(common memory allocation)/meta space or permanent genration.
	//it will create only one copy for all the object
	//Static is only work in class variables not in local variables
	//when we want to access the not Static variable we need to use (ObjectReferenceName . variable) and
	                               //for non static we need to use (className . variable )
	

	public static void main(String[] args) {
		
	Car a = new Car();
	a.name = "mohita";
	a.car = "BMW";
	a.price = 80;
	
	//how to access static variable
	//using the class name
	
	System.out.println(a.name+" "+a.car+" "+a.price+" "+ Car.wheel);
	System.out.println(a.wheel);//not a right way of calling static var using the reference name
	System.out.println(wheel);
	System.out.println(a.name);
	
	Car b = new Car();
	b.name = "Anahita";
	b.car = "Audi";
	b.price = 90;
	
	
	Car c = new Car();
	c.name = "Arunita";
	c.car = "honda";
	c.price = 20;
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
