package javasession;

public class StaticMethodOverloading {
	
	public static void login() {
		
	}
	
    public static void login(int i) {
		
	}

    public static void login(int i, int j) {
	
    }//StaticMethodOverloading is possible

    
    
    
	public static void main(String[] nav) {
		System.out.println("main method"); //JVM only run the program those who have method with 
		                                   //public, static,void,main, and only one string array variable
	
		StaticMethodOverloading.main(10);
		StaticMethodOverloading.main(10, 20);
		
		StaticMethodOverloading ob = new StaticMethodOverloading();
		ob.main(10,12.33);
		
//static binding = src code(.java) --compile time --(.class)decision of method calling -- jvm -- run time -- machine code(os)
                                    //compile time error
		//dynamic binding = run time error		
	
	}
	
	
	
    public void main(int a,double d) {
		System.out.println("main method"+ a+d);	
	}
    
    
    public static void main(int a) {
		System.out.println("main method"+ a);	
	}
    
    
    public static void main(int a[]) {
		System.out.println("main method"+ a);	
	}
    
    
    
    public static void main(String a[], int b) {
		System.out.println("main method"+ b);	
	}
    
    
    
    public static void main() {
		System.out.println("main method with any value");	
	}
    
    
    
    public static void main(int a, int b) {
		System.out.println("main method"+ a + b);	
	}
    
    
    

}
