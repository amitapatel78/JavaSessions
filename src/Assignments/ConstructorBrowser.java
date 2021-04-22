package Assignments;

import java.util.ArrayList;

public class ConstructorBrowser {
	String browserName;
	String vendorname;
	int currentVersion;
	
	
	public ConstructorBrowser(String browserName) {
		this.browserName = browserName;
	}

	public ConstructorBrowser(String browserName, int currentVersion) {
		this.browserName = browserName;
		this.currentVersion = currentVersion;
	}
	
	public ConstructorBrowser(String browserName,String vendorname) {
		this.browserName = browserName;
		this.vendorname = vendorname;
	}

	public ConstructorBrowser(String browserName, String vendorname, int currentVersion) {
	
		this.browserName = browserName;
		this.vendorname = vendorname;
		this.currentVersion = currentVersion;
	}
	
	public ArrayList<Object> ConstructorBrowser() {
		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add("Google Chrome");
		obj.add("Google");
		obj.add(86);
		return obj;
	}
	
	public String getBrowserName() {
		return browserName;
	}
	public String getVendorName() {
		return vendorname;
	}
	public int getcurrentVersion() {
		return currentVersion;
	}
}


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
