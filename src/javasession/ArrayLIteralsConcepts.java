package javasession;

import java.util.Arrays;

public class ArrayLIteralsConcepts {

	public static void main(String[] args) {
		
		//2.Array Literals
		
		int a[] = {1,20,55,38,49,47,101};
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		
		double d[] = {1.1,1.2,1.3,1.4,2.1,2.5};
		char vowles[] = {'a','e','i','o','u'};
		
		String bro[] = {"chrome","firefox","IE","Edge","safari"};
		for(int k=0; k<bro.length; k++) {
			System.out.println(bro[k]);
//			if(bro[k].equals("IE")) {
//				System.out.println("this is deprecated/not approve");	
//			}
			switch (bro[k]) {
			case "chrome":
				System.out.println("chrome welcomes you");
				break;
			case "firefox":
				System.out.println("firefox welcomes you");
				break;
			case "IE":
				System.out.println("IE welcomes you");
				break;
			case "Edge":
				System.out.println("Edge welcomes you");
				break;
			case "safari":
				System.out.println("safari welcomes you");
				break;


			default:
				System.out.println("sorry there is no bro");
				break;
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
