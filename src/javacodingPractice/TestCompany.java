package javacodingPractice;

public class TestCompany {

public static void main(String[] args) {

// if we need to create thousands of objects and variable this is very length job. 
//	To overcome this issue we need to use constructor	
//		Company c1 = new Company();
//		c1.name = "IBM";
//		c1.city = "Pune";
//		
//		Company c2 = new Company();
//		c2.name = "MS";
//		c2.city = "Bangalore";
	
		Company c0 = new Company();// Default constructor will be called 
		c0.name = "ABC";
		System.out.println(c0.name);
		
		Company c1 = new Company("IBM", 1000);
		
		System.out.println(c1.name);
		System.out.println(c1.empCount);
		
		Company c2 = new Company("MS", 2000, "Bangalore");
		System.out.println(c2.name+ " "+ c2.empCount + " " + c2.city);
		System.out.println(c2.addres);
		
		
		Company c4 = new Company("TCS", 5000, "Pune", "test address", "TATA");
		System.out.println(c4.name);
		System.out.println(c4.ceoName);
		
		System.out.println(c1.ceoName);
		
	}
}
