package AccMod2;

import AccMod1.Car;

public class Cycle {
	
	int p;//class var -- give one copy to each object
	static int q;//CMA

	public static void main(String[] args) {

		Car c = new Car();
		////c.brand = "maruti"; // (different package non-subclass) cant't access private,default,protected variables
		//c.mileage = 27;
		//c.price = 20000;
		c.name = "ashis";//only public 
		
		
		int i =10;//local var -- stack memo
	}

}
