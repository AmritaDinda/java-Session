package BuilderPattern;

public class Shopping {

	public Shopping login() {
		System.out.println("Login to app");
		return this;
	}

	public Shopping login(String un, String pwd) {
		System.out.println("Login to app : " + un + " " + pwd);
		return this;

	}

	public Shopping search() {
		System.out.println("product search");
		return this;

	}

	public Shopping search(String name) {
		System.out.println("product search:" + name);
		return this;

	}

	public Shopping adTOCart(String name) {
		System.out.println("adding cart :" + name);
		return this;

	}

	public Shopping doPayment(String cc, int cvv) {
		System.out.println("making payment with : " + cc + " " + cvv);
		return this;

	}

	public Shopping doPayment(String upi) {
		System.out.println("making payment with : " + upi);
		return this;

	}

	public Shopping genrateOrder() {
		System.out.println("order Id is : 1234");
		return this;

	}
	public Shopping logOut() {
		System.out.println("LogOut");
		return this;
		
	}

}
