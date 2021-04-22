package Assignments;

import java.util.ArrayList;

public class ConstructorAssignmentByNaveen {
	
	String name;
	int age;
	ArrayList<String> deviceList;
	

	public ConstructorAssignmentByNaveen(String name, int age, ArrayList<String> deviceList) {
		super();
		this.name = name;
		this.age = age;
		this.deviceList = deviceList;
	}


	public static void main(String[] args) {
		
		ArrayList<String> empDeviceList = new ArrayList<String>();
		empDeviceList.add("iphone 12");
		empDeviceList.add("Macbook pro");
		empDeviceList.add("Monitor");
		
		ConstructorAssignmentByNaveen e1 = new ConstructorAssignmentByNaveen("Tom", 25, empDeviceList);
		System.out.println(e1.name + " "+ e1.age);
		
		System.out.println(e1.deviceList);
		System.out.println(e1.deviceList.size());
		
		for (int i=0;i<e1.deviceList.size();i++) {
			System.out.println(e1.deviceList.get(i));
		}

	}

}
