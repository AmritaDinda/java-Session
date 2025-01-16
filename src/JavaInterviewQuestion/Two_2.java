package JavaInterviewQuestion;

import java.util.stream.IntStream;

public class Two_2 {
	
	//print 1 to 100 without using for/while/do-while loop in code.
	  //1.recursive function
	  //2.java Streams
	
	public static void printNum(int num) {  	  //recursive function
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
		
	}


	public static void main(String[] args) {
		
		printNum(1);

			IntStream.range(1,101).forEach(e -> System.out.println(e));  	  //java Streams

		
		
		
		
		
	}

}
