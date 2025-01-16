package Oop_Abstract;

public class LoginPage extends Page {
	
	 public LoginPage() {
		 System.out.println(" Lp---const.... ");
	 }
	 public LoginPage(int i) {
		 System.out.println(" Lp---const.... "+i);
	 }


	@Override
	public void title() {
		System.out.println("login title");
	}

	@Override
	public void url() {
		System.out.println("https://www.abe.com/login.html");
	}
	
	@Override
	public void pageTimeLoad() {
		System.out.println("page time out--5 sec");
	}
	
	public void forgotpwd() {
		System.out.println("forgotpwd");
	}
	

}
