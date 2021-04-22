package SeleniumArch;

public class SafariBrowser implements WebDriver{

	public SafariBrowser() {
		System.out.println("lunch Safari browser....");
	}

	@Override
	public void findElement() {
		System.out.println("findelement");
		
	}

	@Override
	public void get(String url) {
		System.out.println("lunch url :" + url);
	}

	@Override
	public void click(String element) {
		System.out.println("click on element :" + element);
		
	}

	
	public void sendKeys(String element, String value) {
		System.out.println("enter value in element : "+ element + "value = " + value);
		
	}

	@Override
	public String title() {
		System.out.println("title of the page.....");
		return "some title";
		
	}

	@Override
	public void quit() {
		System.out.println("suit the browser");
		
		
	}

	@Override
	public void sendKeys() {
	
		
	}
	
	
}
