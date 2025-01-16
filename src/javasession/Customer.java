package javasession;

public class Customer {
	String name;
	int age;
	double salary;
	char gender;
	boolean isActive;
	String dob;
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);
		System.out.println(c1.gender);//the official value is /u0000 --unicode value
		System.out.println(c1.dob);

		c1.name  = "namrata";
		System.out.println(c1.name);
		
		Customer c2 = new Customer();
		
		Customer c3 = new Customer();//object with reference
		
		new Customer();//no reference object
		
		Customer c4;//just a reference without object
		
		Customer c5 = new Customer();
		c5 = null;//null reference object
		
		//call gc;
		//System.gc(); // not recommended...not a good practice
		
		Customer c6 = new Customer();
		Customer c7 = new Customer();
		c6 = c7;  //may be it is eligible for the garbage collector in future
		
		Customer c8;
		c8 = new Customer();
		

		
		

		
		

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
