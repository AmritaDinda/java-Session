package javasession;

public class TimeComplexity {

	public static void main(String[] args) {
  //time complexity -its just a majorment and notation to check that how optimized code is written
		int i = 1;
		System.out.println(i);//1
		
		//constant time : Big O(1)
		 
		String name = "tom";
		System.out.print(name);//O(1)
		
		int n =100;
		for(int p =1;p<=n;p++) {
		System.out.println(p);
		}
		
		
		//1 + n + n + n =3n+1 -->linear equation
		//3n+1 = 3n = O(n)
		
		System.out.println("------------");	
	
	//nested loop:
		//00 01 02 03 04
		//10 11 12 13 14
		//20 21 22 23 24
		//30 31 32 33 34
		
		for( int m =0; m<=3; m++ ) {
			
			for( int k =0; k<=4; k++ ) {
				System.out.print(m+""+k+" ");
			}
			System.out.println();
		}
		
		
		//(1+n+n+n)(1+n+n+n)==>(1+3n)(1+3n)==> 1+3n+3n+9n^2 ==> 9n^2+6n+1  --quadratic
		//9n^2+6n ==> 3(3n^2+2n) ==> n^2+n ==>n(n+1) ==> n^2 ==> O(n^2)
		
		
		//000 001 002 003 004
         for( int m =0; m<=3; m++ ) {
			
			for( int k =0; k<=4; k++ ) {
				
				for(int d =0; d<=9; d++) {
					
				System.out.print(m+""+k+""+d+" ");
				}
			}
			System.out.println();
		}
		
		//(1+n+n+n)(1+n+n+n)(1+n+n+n) -->n^3+n^2+n+1 -->cubic eq -->O(n^3)

		
         
         //BS - binary search:
         // n/2  n/4  n/8  n/16
         //32 ---> 16 ----> 8 --->4 --->2 --->1
         
         //O(log n)
         //k = n/2
         //log k = log(n/2)
         //log k = log n +/- log2
         //log k =log n
         //k = log(n)
         
         //practice-

//         for(byte b = 0; b<=127; b++) {
//        	 System.out.println(b);
//         }
//don't take the number that is just border of range.
         //otherwise it will give you the infinite loop
         // in this case byte range is -128 to 127			
			
			
		//
         byte t1 = 065;//octal number -->8 -->0 to 7 for each digit.
         System.out.println(t1);
         //octal to decimal:
         // 065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
         //any number which is starting from zero is octal number.
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
			
			
			
			
			
			
	}

}
