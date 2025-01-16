package AccMod2;

import AccMod1.Car;

public class sizuki extends Car{

	public static void main(String[] args) {

		sizuki si  = new sizuki();
		//si.brand = "maruti"; // (different package subclass) cant't access private,default variables
		//si.mileage = 27;
		si.name = "ashis";//only public or protected
	}

}
