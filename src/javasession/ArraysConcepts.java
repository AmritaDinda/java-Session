package javasession;

import java.util.Arrays;

public class ArraysConcepts {

	public static void main(String[] args) {
		
		//1. With new keyword:
		int a[] = new int[4];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		System.out.println(a[0]);
		System.out.println(a[3]);
		//System.out.println(a[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(a[-1]);//ArrayIndexOutOfBoundsException
		
		int len =a.length;
		System.out.println(len);
		
		int hi = len - 1;
		System.out.println(hi);
		
		int li = 0;
		System.out.println(li);
		
		System.out.println("______");
		
		//To print all the values from the Array:use for loop:
		
		//for(int i = 0; i<a.length; i++) 
		//for(int i = 0; i<len; i++) 
		for(int i = 0; i<4; i++) {
			System.out.println(a[i]);
		}
		
		//Without Using Loop;
		System.out.println(a);//for memory ID
		
		System.out.println(Arrays.toString(a));//To print all the values from the Array
		
		//double array:
		double du[] = new double[3];
		du[0]=10.20;
		du[1]=11.30;
		du[2]=12.40;
		System.out.println(du[0] + du[2]);
		System.out.println(Arrays.toString(du));
		
		//String array:
		String emp[] = new String[4];
		emp[0]="theyy";
		emp[1]="uuse";
		emp[2]="meu";
		emp[3]="gmu";
		System.out.println(Arrays.toString(emp));
		
		for(int m=0; m<emp.length; m++) {
			System.out.println(emp[m]);
			if(emp[m].equals("meu")) {
				System.out.println("meu salary:"+10000);
			
			}
		}
				
		
		

		//static array ex:
		 //month/days
		 //movies tickets seats
		 //flight tickets
		 //country drop down - 232
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
