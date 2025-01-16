package javasession;

public class Employee {
	
	//class variable -- class data member
     String name;
     int age;
     String city;
     
     
	public static void main(String[] args) {
		
		//Local Variable--
	     String name = "Amrita";
	     System.out.println(name);
	     
	     
	     //class - Template/blueprint of the object/category of the object
	     //object - is a physical entity
	     
	     //object of the class: use new keyword for that
	     
	     Employee obj = new Employee();//(obj) it's a object reference name and (new Employee) is a object of Employee class
	                                    //it's a Non-premitive /object oriented
	     obj.name = "usha";
	     obj.age = 20;
	     obj.city = "LA";
	     System.out.println(obj.name +" " + obj.age +" " + obj.city);
	     
	     Employee obj1 = new Employee();
	     obj1.name = "nisha";
//	     obj1.age = 26;
//	     obj1.city = "Hong kong";
	     System.out.println(obj1.name);
	     System.out.println(obj1.age);
	     System.out.println(obj1.city);

	     //No reference object--not recommended//never create no reference object
	     new Employee().name = "kriti";
	     new Employee().age = 24;
	     new Employee().city = "Raipur";

	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     


	}

}
