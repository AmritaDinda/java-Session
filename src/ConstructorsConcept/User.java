package ConstructorsConcept;

public class User {
	
	String firstName;
	String lastName;
	String emilId;
	String phone;
	String passWord;
	String city;
	
	//user can be created if you have;
	//FN
	//FN,LN
	//FN,LN,emilId
	//FN,LN,emilId,phone
	//FN,LN,emilId,phone,passWord
	//FN,LN,emilId,phone,passWord,city
	
	public User(String firstName) {
		this.firstName = firstName;
	}

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User(String firstName, String lastName, String emilId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emilId = emilId;
	}

	public User(String firstName, String lastName, String emilId, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emilId = emilId;
		this.phone = phone;
	}

	public User(String firstName, String lastName, String emilId, String phone, String passWord) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emilId = emilId;
		this.phone = phone;
		this.passWord = passWord;
	}
	

	public User(String firstName, String lastName, String emilId, String phone, String passWord, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emilId = emilId;
		this.phone = phone;
		this.passWord = passWord;
		this.city = city;
	}

	public static void main(String[] args) {
		
		User a = new User("ankur");
		System.out.println(a.firstName+" "+a.lastName);
		a.lastName = "agrawal";
		System.out.println(a.firstName+" "+a.lastName);
		
		User b = new User("abhinit","mitra","abhinit122@gmail.com","8305391277","abhinit@123","bangalore");
		System.out.println(a.firstName+" "+b.lastName+" "+b.emilId+" "+b.phone+" "+b.passWord+" "+b.city);


		
		
		
		
	}


}
