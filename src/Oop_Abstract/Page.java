package Oop_Abstract;

public abstract class Page {
	
	//can not create the object of abst... class
	//but can create a const.. of abst.. class
	//and the const.. will be called when we create the object of child class
	//100% abstraction
	//0% abstraction
	//partially abstraction (0-100)
	
	
	 public Page() {
		 System.out.println(" page const.... ");
	 }
	 public Page(int i ) {
		 System.out.println("one param page const.... "+i);
	 }
	
	public abstract void title();
	public abstract void url();
	
	public void pageTimeLoad() {
		System.out.println("page time out--10 sec");
	}

	public final void displayLogo() {
		System.out.println("display Logo");
	}
	
	public static void footer() {
		System.out.println("page footer");
	}

}
