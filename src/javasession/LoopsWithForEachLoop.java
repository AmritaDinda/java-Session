package javasession;

import java.util.Arrays;

public class LoopsWithForEachLoop {

	public static void main(String[] args) {

		//for each loop:
		int a[] = new int[4];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		for(int e : a ) {
		System.out.println(e);
		}//O(n)
		
		System.out.println(a[2]);
		
		String emp[] = new String[4];
		emp[0]="theyy";
		emp[1]="uuse";
		emp[2]="meu";
		emp[3]="gmu";
		 
		for(String e : emp) {
			System.out.println(e);
			if(e.equals("meu")) {
				System.out.println("meu = "+"he is a devloper");
				break;
			}
		}
		
		//
		Object em[] = new Object[5];
		em[0] = "miui";
		em[1] = 23;
		em[2] = 'f';
		em[3] = 20.22;
		em[4] = true;
		
		for(Object e : em) {
			System.out.println(e);

		}
		
		
		//reverse printing with using for loop:
       int ai[] = new int[4];
		
		ai[0]=10;
		ai[1]=20;
		ai[2]=30;
		ai[3]=40;
		
		for(int i=ai.length-1; i>=0; i--) {
			System.out.println(ai[i]);
		}
		
		//for each loop is not capable for operates this reverse operation
		
		System.out.println("------------------------------------------------");
		
	//
		int test[] = {10,23,35,48,59,82,62,909};
		System.out.println(test.length);
		System.out.println(test[3]);
		
		test[0] = 88;
		System.out.println(test[0]);
		System.out.println(Arrays.toString(test));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
