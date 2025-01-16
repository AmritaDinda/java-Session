package StringManipulation;

public class StringImmutable {

	public static void main(String[] args) {

		String s = "selenium";
		
		String t = s +"helllo";
		System.out.println(t);
		System.out.println(s);

		
		String st = "JAVA";
		System.out.println(s+"python");
		System.out.println(st);
		
		st = st + "Automation";
		System.out.println(st);//javaAutomation
		
		String u  = "java";
		
		//Mutable classes:
		//StringBuilder(1.5) and StringBuffer(1.0)
		StringBuilder sb = new StringBuilder("testing");
		System.out.println(sb);

		sb.append("Automation");
		System.out.println(sb);
		
		String pop = "    submit   ";
		pop =pop.trim();
		System.out.println(pop);


		
	}

}
