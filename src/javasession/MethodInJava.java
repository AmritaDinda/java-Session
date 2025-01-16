package javasession;

public class MethodInJava {
	
	//method - class data members
	
	//1.no input,no return:
	//void - no return - function can not return  anythings
	public void test() {
		System.out.println("test method");
		int i = 10;
		System.out.println(i);

	}
	
	//2.no input,but some return:
	//return type : int
	
	public int totalAmount() {
		System.out.println("total Amount is");
		int i  = 10;
		int tax = 5;
		int finalPayment = i+tax;
		return finalPayment;	
	}
	
	public String trainerName() {
	System.out.println("naveen");
	String name = "naveen";
	return name;//the purpose of return is to add moreover logic further
	}
	
	public char getGender() {
		System.out.println("get Gender");
		char c ='f';
		return c;
	}
	
	//3.some input and sum return;:
	public int add(int a,int b) {  //method parameters
		System.out.println("Adding two number");
		int sum = a+b;
		return sum;
		

	}
	


	public static void main(String[] args) {
		
		MethodInJava obj = new MethodInJava();
		obj.test();//calling a method
		
		int va = obj.totalAmount();
		System.out.println(va);
		
		String tr = obj.trainerName();
		System.out.println(tr);
		if(tr.equals("naveen")) {
			System.out.println("yes naveen is a trainer");

		}
		
		char g = obj.getGender();
		System.out.println(g);
		System.out.println((byte)g);
		
		int s1 = obj.add(10,20);//arguments
		System.out.println(s1);
		
		int s2 = obj.add(30,40);
		System.out.println(s2-5);
		
		

		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
