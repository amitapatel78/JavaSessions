package Assignments;

import java.util.ArrayList;

public class ConstructorAssignment {

	String name;
	String country;
	String establishedDate;
	

	public ArrayList<String> ConstructorAssignment() {
		ArrayList<String> courseList = new ArrayList<String>();
		courseList.add("Design Engineering");
		courseList.add("Electrical Engineering");
		courseList.add("Mechanical Engineering");
		return courseList;
	}

	public ConstructorAssignment(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public ConstructorAssignment(String name, String country, String establishedDate) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;

	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public String getEstablishedDate() {
		return establishedDate;
	}

}

//Constructor Assignments:
//1. Design a University class template with the following features:
// variables:
//name
//country
//stablishedDate
//List of course provided in Array List<String>
//
//--Design the constructor of this class with different parameters and all parameters.
//
//--Write the get method of each variable with return keyword. 
//
//2. Design a browser class template with the following features:
// variables:
//browserName
//vendorName
//currentVersion
//List of plugins supported by Browser in Array List<String>
//
//--Design the constructor of this class with different parameters and all parameters.
//
//--Write the get method of each variable with return keyword. 
