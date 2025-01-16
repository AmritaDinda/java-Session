package Oop_Encapsulation;

public class EmpTest {
	private String car;

	public static void main(String[] args) {
		EmpTest e = new EmpTest();
		 String r = e.car = "lambo";
			System.out.println(r);

			System.out.println("--------");
			System.out.println("--------");

		
		//post
		Employee e1 = new Employee("abhinisha", 20, 29.3,"bangalore");
		
//		e1.setName("arush");
//		e1.setAge(23);
//		e1.setCity("bangalore");
//		e1.setSalary(2.3);
		
		//get
		String q = e1.getName();
		System.out.println(q);
		System.out.println(e1.getAge());
		System.out.println(e1.getCity());
		System.out.println(e1.getSalary());

		System.out.println("--------");
		
		//put
		e1.setAge(26);
		e1.setCity("bhubaneshwar");
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getCity());
		System.out.println(e1.getSalary());

		
	}

}
