package javasession;

public class LoopConcept {

	public static void main(String[] args) {
		
		//print 1 to 10 
		//1. while loop(when repetated task we have to do again again at that condition loop concept is introduce)
		   //process-(start-condition-statement-end)
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
		i++;
		//i = i+1;
		//++i;	
		//i = i+2; (it used to print even and odd number also)
		}
		
		int k = 1;
		while(true) {
			System.out.println("welcome to hotel taj");
			if(k==5) {
				break;
			}
			k++;
		}
		
	//2.for loop
	//1 to 10
	//for(initialize; condition; increment/decrement)
		
		for(int j = 1; j<=10; j++) {
			System.out.println(j);
			
		}
		
		
		
		
		int c = 1;
		for(;true ;) {
			System.out.println("welcome to my lapii");
		if(c==5) {
			break;
		}
		c++;
		}
		
	
	//printing ASCII value	
		for(char ch = 'a'; ch<='z'; ch++) {
			System.out.println(ch + "=" + (byte)ch);
		}
		
		
		
		byte b ='a';//we will also use that for printing ASCII value of a
		System.out.println(b);
		
		//we don't used boolean keyword in for loop
		
		
		//
		for(double d = 1.2;d<=5.0;d++) {
			System.out.println(d);
		}
		
		
		//
		for (int w =1;w<=100;w++) {
			
			if(w % 2 == 0) {
				System.out.println(w);	
			}
		}
		
	
		
		//use cases of while loop:
		
		//when number of iterations are not fixed--while loop.
		//total links/images in the pages.
		//webtable paginaton 1 2 3 4 .....next.
		//webelement is loading on the page.
		//page load time out.
		//calender.
		//build is running:10min,2hr,30min.
		
		
		
		//use cases of for loop:
		
		//when number of iterations is fixed--for loop.
		//month/dates drop down.
		//category options.
		//Array,Arraylist.
		//excel file.
		//country drop down.
		
		
		//3.do-while loop:
		//do-while loop allow you to execute the statement atleast one time.
		 //process-(start-statement-condition-end)
		int e = 1;
		do {
			System.out.println(e);
			e++;
		}
		while(e<=10);
		
		//use cases of do-while loop:
		 
		//webtable pagination:check if element is already present in the table,click on it and end the loop.
		//go and check the element first and then start the while loop.
		//calender:
		
		
		
//4.for each
//5.streams		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
