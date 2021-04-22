package BuilderPattern;

public class UberApp {

	
	public UberApp doLogin(String un, String pwd) {
		System.out.println("login with : " + un + pwd);
		return this;
	}

	public UberApp search(String carModel) {
		System.out.println("searching product: " + carModel);
		return this;
	}

	public UberApp search(String carModel, String color) {
		System.out.println("searching Car: " + carModel + "" + color);
		return this;
	}

	public UberApp booktheCab(String carName) {
		System.out.println("searching Car: " + carName);
		return this;
	}

	public UberApp checkout(String carName) {
		System.out.println("check out: " + carName);
		return this;
	}

	public UberApp doPayment(String CC, String pwd) {
		System.out.println("Payment done with : " + CC + ":" + pwd);
		return this;
	}

	public UberApp cancelBooking(String CC, String pwd) {
		System.out.println("cancel Booking with : " + CC + ":" + pwd);
		return this;
	}

	public UberApp logout() {
		System.out.println("logout from app.....");
		return this;
	}

}
