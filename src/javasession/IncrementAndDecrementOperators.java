package javasession;

public class IncrementAndDecrementOperators {
 
     public static void main(String[] args) {
    	 
    	 // ++ and --
    	 
    	 //post increment
    	 int a = 1;
    	 int b = a++;
    	 System.out.println(a);//2
    	 System.out.println(b);//1
    	 
    	 int l = -3;
    	 int m = l++;
    	 System.out.println(l);//-2
    	 System.out.println(m);//-3
    	 
    	 //pre increment
    	 int u = 1;
    	 int y = ++u;
    	 System.out.println(u);//2
    	 System.out.println(y);//2
    	 
    	 int v = -99;
    	 int vv = ++v;
    	 System.out.println(v);//-98
    	 System.out.println(vv);//-98
    	 
    	 int pop = 2;
    	 System.out.println(pop++);//2
    	 System.out.println(pop);
    	 
    	 int loop = 2;
    	 System.out.println(++loop);//2
    	 System.out.println(loop);
    	 
    	 int amount = 10;
    	 int finalamount = amount + 4;
    	 System.out.println(finalamount);
    	 
    	 // post decrement:
    	 int tt = 2;
    	 int pp = tt--;
    	 System.out.println(tt);//1
    	 System.out.println(pp);//2
    	 
    	 int rest = -99;
    	 int API = rest--;
    	 System.out.println(rest);//-100
    	 System.out.println(API);//-99	
    	 
    	 //pre decrement:
    	 int aa = 2;
    	 int bb = --aa;
    	 System.out.println(aa);//1
    	 System.out.println(bb);//1
    	 
    	 int s3 = 40;
    	 System.out.println(s3--);//40
    	 System.out.println(s3);//39
    	 
    	 int p3 = 50;
    	 System.out.println(--p3);//49
    	 System.out.println(p3);//49
    	 
    	 System.out.println(p3+1);//49+1=50
    	 
    	 int na = 1;
    	 int test = na++ + na++ + na++ + na++ ;
    	 System.out.println(test);
    	 System.out.println(na); 
    		
    
     }

}
