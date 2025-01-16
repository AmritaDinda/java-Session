package StringManipulation;

public class StringConcepts {

	public static void main(String[] args) {

		//String literals:
		String s = "Hello";
		String s1 = "Hello";
		String s2 = "hello";
		
		System.out.println(s==s1);//true
		System.out.println(s1==s2);

		//String object with new keyword:
		String st = new String("JAVA");
		
		String st1 = new String("Hello");
		
		System.out.println(s==st1);//false
		System.out.println(s1.equals(st1));//true

		String test = new String("Selenium"); //1 -->Heap
		test.intern(); //1 -->SCP (String constant pole)
		String t1 = "Selenium";//0
		//total objects are created = 2

		String st4 = new String();
		System.out.println(st4.length());


		
		
	}

}
