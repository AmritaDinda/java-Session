package Oop_interface;

public interface USMedical extends WHO {
	
	//variables are static and final in nature (by default)
	int min_fee  = 10;
	boolean isApproved = true;
	
	//abstract method:
	//no method body
	//only method declaration/method prototype/no buss logic
	//can not create the object of interface
	//can not create the constructor.. of the interface
	
	//abstract method : 100% abstraction --Oop
	public void physioService();
	
	public void cardioService();
	
	public void detalService();
	
	public void emergencyService(); 
	
	
	//after JDK 1.8 :
	//1. we can have static method with method body.
	public static void billing() {
		System.out.println("us - billing");
	}
	
	//2.default method with method body:
	default void medicalTest() {
		System.out.println("us - medical test");
	}

}
