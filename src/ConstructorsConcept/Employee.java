package ConstructorsConcept;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	//const...
	//name is as same as the class
	//can not have any return value/void
	//no return type
	//const.. will be called when you create a new object
	//const... will be overloaded
	
	public Employee() {  //0 param const
		System.out.println("default const.....");

	}
	
	public Employee(int i) {  //1 param const
		System.out.println("1 param const....."+i);

	}
	
	public Employee(int i,String p) { //2 param const
		System.out.println("2 param const....."+i+p);

	}


	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.name = "tom";
		obj.age = 27;
		obj.salary = 23.4;
		System.out.println(obj.name);
		
		
		//Employee objj = new Employee(70);
		//Employee objji = new Employee(49,"rim");


		
	}

}
