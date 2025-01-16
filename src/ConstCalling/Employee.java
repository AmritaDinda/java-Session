package ConstCalling;

public class Employee {
	
	String name;
	int age;
	String city;
	
public 	Employee(){
	this("Ravi",20);
	System.out.println("hi emp...");
}

public Employee(String name,int age) {
	this.name = name;
	this.age = age;
}
public Employee(String name,int age,String city) {
	this.name = name;
	this.age = age;
	this.city = city;
}
public Employee(String name) {
	//this("nitu",23,"LA");
	this();
	
	this.name = "shukla";
	this.age = 60;
	this.city = "bengalore";
}


//use cases of this keyword:

//1.in the const.. to initialized the class variable with local variables
//2.getter/setter - encapsulation
//3.builder pattern - return this
//4.const.. calling is possible
  //it should be the first statement in the const..
 //we will use this() keyword for calling const.. within a const..

}
