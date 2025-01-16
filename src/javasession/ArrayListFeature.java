package javasession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeature {

	public static void main(String[] args) {

		ArrayList <Integer> ar = new ArrayList<Integer>(20);
		//vc=20,pc=0 initially
		//pc=10, Lf=10/2=5(vc)after fill up all pc
//1.
		ArrayList <Integer> numList = new ArrayList<Integer>();
         //vc=10,pc=0
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		System.out.println(numList.size());//4
		
		numList.remove(2);//it will remove the 2 index
		System.out.println(numList.size());//3
		System.out.println(numList.get(2));
		//System.out.println(numList.get(4));IndexOutOfBoundsException because exits 0-3 index only

//2.
		ArrayList <String> empList = new ArrayList<String>(Arrays.asList("tom","peter","Robin","ravi"));
		System.out.println(empList.size());
		System.out.println(empList);
		
		empList.add("Lisa");
		System.out.println(empList.size());
		System.out.println(empList);

		empList.add(0,"bhomika");
		System.out.println(empList);

		empList.add(3,"usha");
		System.out.println(empList);
		System.out.println(empList.size());


//		empList.add(9,"nisha");//IOB ArrayList always follow the continuous memory allocation,it dosen't store randomly		 
//		System.out.println(empList);

//		empList.add(8,"nitu");//we can't adding just next of the last index also
//		System.out.println(empList);
		
		
		System.out.println("----------");

//3.
		List<Integer> numbs = Arrays.asList(1,2,3,4);//list is a interface, it's a the parent of ArrayList
		System.out.println(numbs);
		System.out.println(numbs.size());

		List<String> s = Arrays.asList("loginpage","homepage","regpage");//list is a interface, it's a the parent of ArrayList

		
		ArrayList <Integer> nList = new ArrayList<Integer>();
        //vc=10,pc=0
		nList.add(120);
		nList.add(19);
		nList.add(30);
		nList.add(490);
		System.out.println(nList);
		
		Collections.sort(nList);//use for sorting/arranging in ArrayList or dynamic Array
		System.out.println(nList);
		
		Collections.reverse(nList);
		System.out.println(nList);
		

		int test[] = {12,13,42,54,46};
		Arrays.sort(test);//use for sorting/arranging in Static Array
		System.out.println(test.length);
		System.out.println(Arrays.toString(test));
		
		
		ArrayList <String> mylist = new ArrayList<String>(Collections.nCopies(10,"iphone"));
		System.out.println(mylist.size());
		System.out.println(mylist);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
