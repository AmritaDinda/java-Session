package Oop_Encapsulation;//Encapsulation it is a process to fetch the private variables through the -
                          //       -public method or public const..
public class LoginPage {

	private String userName;
	private String passWord;
	
	//const...
	public LoginPage(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	

	public String getUser() {
		return userName;
	}

	public void setUser(String userName) {
		this.userName = userName;

	}

	public String getPass() {
		return passWord;
	}

	public void setpass(String passWord) {
		this.passWord = passWord;

	}
	
	public void doLogin(String un,String pwd) {
		System.out.println("enter userName : "+un);
		System.out.println("enter password : "+pwd);
		System.out.println("click on login button");

		isActiveStatus(un);
		if(isActiveStatus(un)) {
			System.out.println("user is active-logged in");
		}
		else {
			System.out.println("user is inactive-account id blocked");
		}
	}

	
	
	private boolean isActiveStatus(String un) {
		System.out.println("checking user status : "+un);
		return true;

	}

}
