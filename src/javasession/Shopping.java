package javasession;

public class Shopping {
	
	//method overloading:
	 //within the same class,if you have number of methods
	 //1.with the same name
	 //2.with the different parameters
	 //3.with the different number of parameters
	 //4.with different order of parameters
	 //5.return type dosen't matter
	
	public void test() {
	System.out.println("test methods");
	    }
	
//	public int test() { //its not a method overloading its just a duplicate of another one
//		System.out.println("test methods");
//		return;
//		    }
//	
	public void test(int i) {
		System.out.println(i);
		}
	
	public void test(int i,int j) {
		System.out.println(i+j);
		}

	public void test(String p ) {
		System.out.println(p);
		}
	
	public void test(String p,int q ) {
		System.out.println(p+q);
		}
	
	public void test(int q,String p ) {
		System.out.println(p+q);
		}

	//use case real time:
	public void login() {
		
	}
	
    public void login(String un,String pwd) {
	}
    
    public void login(String un,String pwd,String role) {
		
	}
	
    
    
	//
    public void search() {
		
	}
    
    public void search(String productName) {
		
	}
    
    public void search(String productName, int price) {
		
	}
    
    public void search(String productName, int price,String color) {
		
	}
    
    
    //payment:
    public void doPayment(String upi) {
    	
    }
	
    public void doPayment(String cc,String ccv) {
    	
    }
	
    public void doPayment(String paypal,String pwd,String otp) {
    	
    }
    
    //uber booking:"
    public void booking(String carType) {
    	
    }
    
    public void booking(String carType,String fromeLocation,String toLocation,int passenger) {
    	
    }
    
    public void booking(String carType,String fromeLocation,String toLocation,int passenger,int payment) {
    	
    }
	
	
	
	public static void main(String[] args) {
		
		
		Shopping shop = new Shopping();
		shop.login("shri", "shri@123");
		
		
		
		
		
	}

}
