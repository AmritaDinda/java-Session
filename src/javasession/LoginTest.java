package javasession;

public class LoginTest {
	
	
	
	//entry point of execution.
	//runner method.
	//calling method.
	//like a user for me.
	public static void main(String[] args) {

		
		LoginPage.forgotPsLinks();
		
		
		if(LoginPage.forgotPsLinks()) {
			System.out.println("change the ps");
		}
		
		
	//we have to create object for non-Static methods	
		LoginPage ye = new LoginPage();
		ye.doLogin("amritadinda812gmail.com","Amrita@#123");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
