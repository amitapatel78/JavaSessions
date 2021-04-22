package BuilderPattern;

public class UberTestAssignment {

	public class App {
		
	}
		public static void main (String[] args) {
			UberApp up = new UberApp();
			up.doLogin("Abcd","UberAPP")
				.search("BMW")
					.search("BMW", "Black")
						.booktheCab("BMW 1023820392")
							.checkout("BMW")
								.doPayment("abc", "pwefeowi")
								 	.cancelBooking("xyz", "afidsj")
								 		.logout();
							
			UberApp up1 = new UberApp();	
			up.doLogin("Priya", "Priya123")
			.logout();
			
			UberApp up2 = new UberApp();
			up2.doLogin("Tom", "abcde")
					.search("Ford")
						.booktheCab("Ford 150")
							.doPayment("visa", "1263512327")
								.logout();
			
		
		

	}
}