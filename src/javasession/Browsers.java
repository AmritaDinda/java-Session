package javasession;

public class Browsers {
	
	String name;
	static String hp = "Bangalore";
	
	public int getBrowser() {
		System.out.println("get the browser");
		return 100;
	}

	public static String getBrowservendor() {
		System.out.println("get the vendor");
		return "Mozilla";
	}
	
	
	
	
	public static void main(String[] args) {
		Browsers ob = new Browsers();
		
		System.out.println(ob.name);
		System.out.println(ob.hp);//directly we can call but with warning
		System.out.println(Browsers.hp);//using class name we can call
		
		ob.getBrowser();
		
		getBrowservendor();
		Browsers.getBrowservendor();
		
	    ob.name = "Ammmmm";
		//ob.hp = "pune";
		//ob.getBrowservendor();
		
		
		//object can not hold static properties( variable, method )
		//static will be store in CMA - perm gen(upto 1.7, static memory) - Metaspace( JDK 1.8, dynamic memory)
		//object can call /access Static properties but with warning
		//you should always call the Static with the class name.
		//10 object -->Static copy =1
		//non static copies = 10
		

	}

}
