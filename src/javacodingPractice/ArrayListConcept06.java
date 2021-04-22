package javacodingPractice;

import java.util.ArrayList;

public class ArrayListConcept06 {

	public static void main(String[] args) {
		//ArrayList is a default class in Java
		//maintains the indexing(order)
		
		//ArrayList ar = new ArrayList();
		
		
//		ArrayList a = new ArrayList();
//		a.add(100);
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		System.out.println(ar.size());
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add(12.33);
		ar.add(true);
		ar.add("testing");
		ar.add('m');
		
		System.out.println(ar.size());
		System.out.println("LI = " + 0);
		System.out.println("HI = " + (ar.size()-1));
		
		ar.add(600);
		ar.add(700);
		ar.add("yes");
		ar.add("no");
		ar.add(34.30);
		ar.add(60);
		ar.add(false);
		ar.add('a');
		ar.add("testing");
		
		//to print all the values from arraylist:
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		//int data in arraylist:
				ArrayList<Integer> marks = new ArrayList<Integer>();
				marks.add(100);
				System.out.println(marks.size());
				
				ArrayList<String> namesList = new ArrayList<String>();
				System.out.println(namesList.size());
				System.out.println(namesList);
				namesList.add("tom");//0
				namesList.add("peter");//1
				namesList.add("naveen");//2
				namesList.add("Tony");//3
				namesList.add("lisa");//4
				namesList.add("disha");//5

				System.out.println(namesList);
				System.out.println(namesList.get(4));
				//System.out.println(namesList.get(6));//IndexOutOfBound
				//System.out.println(namesList.get(-1));//IndexOutOfBound
				
				ArrayList<Double> salary = new ArrayList<Double>();
				salary.add(10.22);
				salary.add(200.00);
				
				ArrayList<String> linksList = new ArrayList<String>();
				linksList.add("Home");//0
				linksList.add("login");//1
				linksList.add("contact us");//2

				System.out.println(linksList);
				linksList.remove(1);
				System.out.println(linksList);
		
		
	}	
	

}
