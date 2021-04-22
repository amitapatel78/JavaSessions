package SuperKeyword;

public class Car {
	
	public Car() {
		System.out.println("car -- constructor");
	}
	
	public Car(int a) {
		System.out.println("car -- constructor" + a);
	}
	int speed = 120;
	
	public void start() {
		System.out.println("car -- start");
	}
	
	public void display() {
		System.out.println("car -- display");
	}
	
}
