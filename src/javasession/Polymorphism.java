package javasession;

public class Polymorphism {
	
	//poly(more) + morphism(forms)
	//Method  Overloading : compile time (Static binding) : compiler has already taken a decision that which method has 
	                                                      //to be called on the basis of given value.
	
	
	//method Overriding : run time (Dynamic binding)
	
	public void search() {
		
	}
	
    public void search(String ProductName) {
		System.out.println(ProductName);
	}

    public void search(String ProductName,int price) {
		System.out.println(ProductName + " "+ price);

    }

    
     
	public static void main(String[] args) {

		Polymorphism obj = new Polymorphism();
		obj.search("macbook");
		obj.search("imac", 10000);
		
		
		
		
		
	}

}
