package Oop_Encapsulation;

public class AmazonLogin {

	public static void main(String[] args) {
		
		//registration:
		LoginPage s1 = new LoginPage("Amritadinda812@gmail.com","Amrita@#123");

		//login:
		s1.doLogin(s1.getUser(), s1.getPass());
		
		//reset pwd:
		s1.setpass("anujumi");
		s1.doLogin(s1.getUser(), s1.getPass());
		
		//new user ashi - seller:
		LoginPage s2 = new LoginPage("Amritaashi812@gmail.com","Amritaashi@#123");

		//login
		s2.doLogin(s2.getUser(), s2.getPass());

		
		
	}

}
