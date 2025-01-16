package ConstructorsConcept;

public class ETest {
	
	String name;
	int age;
	double salary;
	
	//const is restrict to create unwanted object
	//hidden const - when you don't create any const..but object is created
	public ETest(String name) {
		this.name = name;
	}
	
	public ETest(String name,int age) {
		this.name = name;
		this.age = age;

	}
	
	public ETest(String name,int age,double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public static void main(String[] args) {
		
		ETest e = new ETest("Tomi");
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.salary);

		
		ETest e1 = new ETest("abhi",20);
		System.out.println(e1.name+" "+e1.age);
		
		ETest e2 = new ETest("naina",18,20.7);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary);
		
		
	}

}
