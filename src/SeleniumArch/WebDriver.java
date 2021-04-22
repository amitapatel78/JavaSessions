package SeleniumArch;

public interface WebDriver extends SearchContext{
	
	@Override
	public void findElement(); // Method overriding without the method body ( means it will not provide any business logic)
	
	public void get(String url);

	public void click(String element);
	
	public void sendKeys();
	
	public String title();
	
	public void quit();
	
}
