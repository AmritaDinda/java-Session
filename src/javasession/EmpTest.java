package javasession;

public class EmpTest {
	
	String name;
	int age;
	
	public void a1(int a,int b) {
		System.out.println(a+b);
	}
	
	public void a2() {
		System.out.println("hello");//calling 
	}
	
	public void a3(EmpTest oob ) {
		oob.name = "Amri";
		oob.age = 23;
		
		System.out.println(name);
		System.out.println(age);

	}
	
	
	
	
	

	public static void main(String[] args) {
		
		EmpTest meo = new EmpTest();
		meo.a1(50, 90); //call by value, call by argument
		
		meo.a3(meo);//call by reference
		
		meo.name = "riya";
		meo.age = 28;
		
		System.out.println(meo.name);
		System.out.println(meo.age);

		meo.a3(meo);//call by reference - it's use for to adjust all the things in one object
		
	}

}
