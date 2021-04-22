package WebDriverArch;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching the Browser");
		checkBrowserversion();
		System.out.println("Browser is launched");
	}

	private void checkBrowserversion() {
		System.out.println("checkBrowserversion");
		checkRAMSpace();
	}

	private void checkRAMSpace() {
		System.out.println("checkRAMSpace");
		OSCompatible();
	}

	private void OSCompatible() {
		System.out.println("OSCompatible");
		needUpgrade();
	}

	private void needUpgrade() {
		System.out.println("need upgrade");
	}

}
