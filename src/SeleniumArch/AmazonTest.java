package SeleniumArch;



public class AmazonTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String browser = "chrome";
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDrier();
		//SafariBrowser driver = new SafariBrowser();
		// cross browser testing;
		
		switch (browser) {
		case "chrome": 
		 driver = new ChromeDriver();
			break;
		case "firefox": 
			driver = new FirefoxDriver();
			break;
		case "Safari": 
			driver = new SafariBrowser();
			break;	
		
		
		default:
			System.out.println("Browser not found");
			break;
		}
		
		driver.get("http://www.amazon.com");
		 String title = driver.title();
		 System.out.println(title);
		
		 
		driver.click("sign up link");
	//	driver.sendKeys( "firstName" , "naveen" );
		driver.quit();
		
		
	}

}
