package SuperKeyword;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW("320d");
		System.out.println(b.speed);
		System.out.println(b.name);
		
		b.checkSpeed();
		b.display(); // it will call child class method as well as parent class method with the super keyword
		
	}

}
