package javasession;

public class StackMemory {
	
	
	
	      // call method within a method-
	//NS -- NS--> yes(no object)
	//S -- S --> yes(no object)
	//NS -- S --> (no object, directly/class name)
	//S -- NS --> need object
	//Stack --> LIFO(last in first out)
	//Queue --> FIFO(first in first out)
	//Stack out of memory --> Stack overflow error
	
	
	
	
	public static void t1() {
		System.out.println("t1 method");
	t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
	t3();
	}
	
	public static void t3() {
		System.out.println("t3 method");
		StackMemory o2 = new StackMemory();
		o2.m1();
	}
	
	
	
	
	public void m1() {
		System.out.println("m1 method");
		int i = 10;
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		int p = 20;
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		//m1();
		StackMemory.t1();
	}
	
	

	public static void main(String[] args) {
		
		StackMemory obj = new StackMemory();
		obj.m1();
		
		
		
		
	}

}
