package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment {

	public static void main(String[] args) {

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection	
		ArrayList<String> colorname = new ArrayList<String>();
		colorname.add("Red");
		colorname.add("yellow");
		colorname.add("Blue");
		colorname.add("Green");
		for (int s = 0; s < colorname.size(); s++) {
			System.out.println(colorname.get(s));
		}
		System.out.println("_______________");
//2. Write a Java program to insert an element into the array list at the first and last positions.		
		
		colorname.add(0,"Purple");
		colorname.add(5,"Pink");
		for (String e: colorname) {
			System.out.println(e);
		}
		System.out.println("_______________");
//3. Write a Java program to retrieve an element (at a specified index) from a given array list.		
		String retrieve	=colorname.get(2);
		System.out.println("retrieve an element from index 2 : " +  retrieve);
		System.out.println("_______________");
//4. Write a Java program to update specific array element by given element.		
		colorname.set(5, "lite Pink");
		System.out.println(colorname);
		System.out.println("_______________");
//5. Write a Java program to remove the third element from a array list. 
		colorname.remove(2);
		System.out.println(colorname);
		System.out.println("_______________");
//6. Write a Java program to search an element in a array list.	
		if (colorname.contains("lite Pink")) {
			System.out.println("Found the element");
		}
		else {
			System.out.println("Element not found");
		}
		System.out.println("_______________");
//7. Write a Java program to reverse elements in a array list	
		Collections.reverse(colorname);
		System.out.println("Reverse elements" + colorname);
		
//8. Write a Java program to extract a portion of a array list.	
		List<String>colornamesub_List  = colorname.subList(0, 4);
		System.out.println("\nExtract a portion of a array list" +"\n"+ colornamesub_List);
//9. Write a Java program of swap two elements in an array list.
		Collections.swap(colornamesub_List, 0, 3);
		System.out.println("\nSwap elements" +"\n"+ colornamesub_List);
//11. Write a Java program to trim the virtual capacity of an array list the current list size.	
		System.out.println("\noriginal virtual capacity" +"\n"+ colorname);
		colorname.trimToSize();
		System.out.println("\nAfter trim the virtual capacity " +"\n"+ colorname);
//12. Write a Java program to print all the elements of a ArrayList using the position of the elements
		for (int p = 0; p < colorname.size(); p++) {
			System.out.println("\nPrint all the elements by index of the elements "+"\n"+ colorname.get(p));
		}
		
//10. Write a Java program to empty an array list.	
		colorname.removeAll(colorname);
		System.out.println("Empty an array list " + colorname);
		
	
		
	}

}
//Write a Java program to create a new array list, add some colors (string) and print out the collection
//
//2. Write a Java program to insert an element into the array list at the first and last positions.
//
//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
//
//4. Write a Java program to update specific array element by given element.
//
//5. Write a Java program to remove the third element from a array list. 
//
//6. Write a Java program to search an element in a array list.
//
//7. Write a Java program to reverse elements in a array list
//
//8. Write a Java program to extract a portion of a array list.
//
//9. Write a Java program of swap two elements in an array list.
//
//10. Write a Java program to empty an array list.
//
//11. Write a Java program to trim the virtual capacity of an array list the current list size.
//
//12. Write a Java program to print all the elements of a ArrayList using the position of the elements
