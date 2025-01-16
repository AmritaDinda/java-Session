package javasession;
public class LoginPage {

	public static boolean forgotPsLinks() {     //static method
		System.out.println("cheking forgot pwd link on the page");
		return true;
	}
	
	
	
	public void doLogin(String ur , String ps) {     //non-Static method 
		System.out.println("Login with"+ ur +":"+ ps);
		System.out.println("logged in");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


