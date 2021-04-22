package Assignments;

import java.util.ArrayList;

public class TestConstructorBrowser {

	public static void main(String[] args) {
		
		ConstructorBrowser Cb = new ConstructorBrowser("FireFox","Mozilla", 85);
		
		System.out.println(Cb.getBrowserName());
		System.out.println(Cb.getVendorName());
		System.out.println(Cb.getcurrentVersion());
		
		
		ArrayList<Object> obj = Cb.ConstructorBrowser();
		for ( Object e : obj)
			System.out.println(e);
		


	}

}
