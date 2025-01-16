package javasession;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		//&& short circuit operator(if first condition is false it don't allow to procedue further)
		
		if(a>b && a>c) {
			System.out.println("a is greatest");
			}
		else if (b>c) {
		    System.out.println("b is greatest");
		    }
		else {
			System.out.println("c is greatest");
		}
		
		
		
		
		
		
		
		
	}

}
