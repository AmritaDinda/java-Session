package String_Manipulation;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {

		String s = " this is my java code";
		
		int le = s.length();
		System.out.println(le);
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(19));
		//System.out.println(s.charAt(-1));//SIOB (StringIndexOutOfBoundsException)
		//System.out.println(s.charAt(20));//SIOB
		
		System.out.println(s.indexOf('t'));
		System.out.println(s.indexOf('i'));//1st occurrence of i  
		System.out.println(s.indexOf('i', s.indexOf('i')+1));

		
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("testing"));//-1

		//
		String test = "   hello world  ";
		System.out.println(test.trim());
		
		// 
		String t = "hello  this is My java code";
		System.out.println(t.toUpperCase());
		System.out.println(t.toLowerCase());

		//
		String dob = "01-01-1990";
		System.out.println(dob.replace('-', '/'));
		
		//
		String t1 = "   hello world   ";
		System.out.println(t1.replace(" ", ""));

		//
		String a1 = "hello world";
		String a2 = "hello World";
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.equalsIgnoreCase(a2));
		
		String c = "    chrome ";
		if(c.trim().equalsIgnoreCase("chrome")){
			System.out.println("PASS");
		}else {
			System.out.println("plz pass the right browser");

		}
		
		// 
		String p = "this is my selenium code";
		System.out.println(p.contains("selenium"));
		
		
		//split:
		
		String lan = "JAVA_PYTHON_DOTNET_RUBY";
		String la[] = lan.split("_");
		
		System.out.println(la[0]);
		System.out.println(la[2]);
		
		System.out.println(Arrays.toString(la));
		
		String pop = "xXseleniumxXXtestingXxXJAVAXxXpythonX";
		String d[] = pop.split("xX");
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);
		System.out.println(Arrays.toString(d));

		//
		String x = "100";
		System.out.println(x+20);
		
		//String to int:
		int q = Integer.parseInt(x);
		System.out.println(q+20);
		
		//String to Double
		String v = "12.33";
		System.out.println(v+10);
		double f = Double.parseDouble(v);
		System.out.println(f+10);
		
		//int to String
		int g = 1000;
		System.out.println(g+10);
		String o1 = String.valueOf(g);
		System.out.println(o1+10);
		
		//string to boolean
		String lg = "true";
		boolean z  = Boolean.parseBoolean(lg);
		if(z) {
			System.out.println("Run and says it's true");

		}



		










		
		
		
		
	}

}
