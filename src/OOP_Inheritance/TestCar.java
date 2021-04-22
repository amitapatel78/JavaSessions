package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();// overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//independent
		b.engine();
		BMW.autoPilot(); // we can call static method directly with the respective class name
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.theftSafety();
		a.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		c.autoPilot();// we can call static method directly with the respective class name
		
		//Top/Up casting 
		Car c1 = new BMW(); // in selenium - Webdriver driver = new ChromeDriver();
		c1.start();
		c1.stop();
		c1.refuel();
		
		Vehicle v1 = new BMW(); // Grand parent reference  
		v1.engine(); // Only this method is allowed 
		
		//down casting: // we never use down casting - we do  not have any use case
		BMW b1 = (BMW) new Car(); //ClassCastEXception
		
		BMW b2 = (BMW) new Vehicle();//ClassCastEXception
		
		

	}

}
