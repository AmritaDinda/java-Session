package javasession;

public class StringConcatination {

	public static void main(String[] args) {
                
		     int a = 10;
		     int b = 20; 
		     
		     System.out.println(a+b);
		     
		     String x = "hello"; //string is a collection of multipal character 
		     String y = "selenium";
		     
		     System.out.println(x+y);
		     System.out.println(a+x);
		     
		     System.out.println(a+b+x+y);//30helloselenium
		     System.out.println(x+y+a+b);//helloselenium1020
		     System.out.println(x+y+(a+b));//helloselenium30
		     
		     System.out.println(a+b+x+y+a+b);//30helloselenium1020
		     System.out.println(a+b+x+y+(a+b));//30helloselenium30
		     
		     double c = 12.33;
		     double d = 23.44;
		     
		     System.out.println(a+b+x+y+a+b+c+d);//concatenation - one string adding with another string is called concatenation.
		     
		     char t1 = 'm';
		     char t2 = 'n';
		      
		     String l = "testing";
		     String u = "automation";
		     
		     System.out.println(l+u);
		     System.out.println(l+u+t1+t2);
		     System.out.println(t1+t2);//char is a type of numeric that's why it will give you the ASCII values
		     System.out.println(t1);
		     
		     System.out.println('m');
		     System.out.println('m'+'n');
		     
		     System.out.println((byte)'a');// for printing the ASCII value of a particular variable
		     System.out.println((byte)'m');
		     
		     int s1 = 100;
		     int s2 = 300;
		     System.out.println("the value of s1 :"+s1);
		     System.out.println("the value of s2 :"+s2);
		     System.out.println("the sum is :"+(s1+s2));
		     








	}

}
