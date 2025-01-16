package JavaInterviewQuestion;

public class one_1 {

	//Print from 1...100 without using any numbers in your code.

	public static void main(String[] args) {

		

		int  one = 'A'/'A';
		String s1 = "..........";
		for(int i = one; i<=(s1.length() * s1.length()); i++) {
			System.out.println(i);
		}
		
		//
		//a-97,b-98,c-99,d-100
		for(int i = one; i<='d';i+=one) {
			System.out.println(i);

		}
		
	}

}
