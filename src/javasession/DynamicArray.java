package javasession;

import java.util.ArrayList;

public class DynamicArray{

	public static void main(String[] args) {
		
		//ArrayList --default class
		//create the object of ArrayList
		
		ArrayList ar = new ArrayList();//this is a raw of arraylist that's why we can fill up various types of data
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());//for print the size/length of array
		System.out.println(ar.get(4));//to get the particular index value
		
		ar.add(30.3);
		ar.add('f');
		ar.add(true);
		ar.add("testing");
		
		System.out.println(ar.size());
		//physical capacity(pc)=0, virtual capacity(vc)=10 in array initially by default
		//after fill up all vc than it will give vc=current pc/2. it's also called load factor(LF=pc/2)

		System.out.println("---------------------------------------------");
		
		//generics in array:
		ArrayList <Integer> marksList = new ArrayList<Integer>();//vc=10,pc=0
		marksList.add(100);
		marksList.add(200);
		marksList.add(120);
		System.out.println(marksList.size());
		
		
		ArrayList <Double> bmiList = new ArrayList<Double>();
		bmiList.add(12.3);
		bmiList.add(100.00);
		System.out.println(bmiList.size());

		
		ArrayList <String> browserList = new ArrayList<String>();
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("safari");
		browserList.add("opera");
		System.out.println(browserList.size());

		System.out.println(browserList);//arraylist allow to print all the values directly without using Array.toString

		for(int s=0; s<browserList.size(); s++) {
			System.out.println(browserList.get(s));
			if(browserList.get(s).equals("firefox")) {
				System.out.println("moizilla");
				break;

			}

		}
		
		
		for(String e:browserList ) {
			System.out.println(e);

			
		}
		
		//emp info: name,age,salary,string,char,true
		ArrayList<Object> empInfoList = new ArrayList<Object>();
		empInfoList.add("Riya");
		empInfoList.add("sinha");
		empInfoList.add(30);
		empInfoList.add(23.3);
		empInfoList.add('f');
		empInfoList.add(true);
		System.out.println(empInfoList.size());
		
		for(Object e:empInfoList) {
			System.out.println(e);//here we can used our logic ,conditions,switch case further

		}
		
		System.out.println("----------");
		
		System.out.println(empInfoList);//this is used only for check the value
		
		
		//use cases:
		 //Uber:carList
		 //amazon:productList
		 //userList
		 //total links -->linksList
		 //total images -->imageList
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
