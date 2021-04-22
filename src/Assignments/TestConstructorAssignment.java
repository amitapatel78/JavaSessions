package Assignments;

import java.util.ArrayList;

public class TestConstructorAssignment {

	public static void main(String[] args) {
		
//		ConstructorAssignment Ca = new ConstructorAssignment("Indian Institute");
//		ConstructorAssignment Ca1 = new ConstructorAssignment("Canadian Institute", "Canada");
		ConstructorAssignment Ca2 = 
				new ConstructorAssignment("American Institute", "America", "1960");
		System.out.println(Ca2.getName());
		System.out.println(Ca2.getCountry());
		System.out.println(Ca2.getEstablishedDate());
		ArrayList<String> ar = Ca2.ConstructorAssignment();
		for (String e : ar)
			System.out.println(e);
		
		}

}
