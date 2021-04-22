package BuilderPattern;

public class ShoppingTest {
	
	public static void main (String[] args) {
		EcommApp ec = new EcommApp();
		ec.doLogin("naveen", "naveen123")
			.search("macbook")
				.addToCart("macbook")
					.checkout("macbook")
						.doPayment("1212 212 212 21212", "2121")
							.getOrderDetails("macbook")
								.logout();
		
		EcommApp ec1 = new EcommApp();
		ec1.doLogin("tom", "tom123")
				.getOrderDetails("NikeShoes")
					.logout();
		
		EcommApp ec2 = new EcommApp();
			ec2.doLogin("disha", "disha123")
					.logout();
	}

}
