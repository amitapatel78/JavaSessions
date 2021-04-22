package OOP_Inheritance;

public class BMW extends Car{
	
	//Method Overriding:
	// When you have a method in parent class and the same method in child class
	// with the same name
	// same number of parameters
	// with the same types 
	public void start() {
		System.out.println("BMW-- start");
	}
	
	@Override
	public void engine() {
			System.out.println("BMW -- engine");
	}
	public void autoParking() {
		System.out.println("BMW-- auto parking");
	}
	public static void autoPilot() {
		System.out.println("BMW -- autoPilot");// Static method can not be overridden
	}
	
}
