package javasession;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		System.out.println(a==b);
		
		if(a==b) {
		System.out.println("hii");
		}
		else {
			System.out.println("hello");
		}
		int c = 10;
		if(c>1);
		System.out.println("bye");

		
		
		if(true) {
			System.out.println("hii selenium");
		}
		else { //dead code
			System.out.println("bye selenium");
		}
		
		
		boolean flag = true;
		if(flag) {
			System.out.println("hi Testing");
		}
		else {
			System.out.println("bye Testing");
		}
		
		
		//
		boolean test = true;
		if(!test) { //! it denote to not true means false
			System.out.println("test is done");
		}
		else {
			System.out.println("test is pending");
		
		 
			
			//nested if:
			int number = 150;
			
			if(number <= 100) {
				System.out.println("Calulate your marks");
			}
			   if(number >= 90) {
				     System.out.println("Grade A");
				      if(number == 100) {
					        System.out.println("you got 100%");
				}
			}
			else {
				System.out.println("Printing a right marks ");
			}
		
		//if if if - else: this is not a right way to written code.
//			   String browser = "chrome";
//			   if (browser.equals("chrome")) {
//			   System.out.println("chrome launch");
//			   }
//			   
//			   if (browser.equals("firefox")) {
//				   System.out.println("firefox launch");
//				   }
//			   
//			   if (browser.equals("safari")) {
//				   System.out.println("safari launch");
//				   }
//	
//			   if (browser.equals("internate explorar")) {
//				   System.out.println("internate explorar launch");
//				   }
//			   else {
//				   System.out.println("please pass the right browser");
//			   }
			   
			   
			  //if - else if:
			   
			   String browser = "chrome";
			   if (browser.equals("chrome")) {  // .equals is used in non-premitive for comparison .
			   System.out.println("chrome launch");
			   }
			   
			   else if (browser.equals("firefox")) {
				   System.out.println("firefox launch");
				   }
			   
			   else if (browser.equals("safari")) {
				   System.out.println("safari launch");
				   }
	
			   else if (browser.equals("internate explorar")) {
				   System.out.println("internate explorar launch");
				   }
			   else {
				   System.out.println("please pass the right browser");
			   }
		
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
		}
	
	}

}
