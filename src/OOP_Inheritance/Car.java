package OOP_Inheritance;

public class Car extends Vehicle {
	
	String name = "My Car"; // we can inherite parent class variable as well
	
	public void start() {
		System.out.println("car-- start");
		
	}
	public void stop() {
		System.out.println("car-- stop");
	}
	public void refuel() {
		System.out.println("car-- refuel");
	}
	public static void autoPilot() {
		System.out.println("Car--autoPilot");
	}
}
