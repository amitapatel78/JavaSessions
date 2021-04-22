package Assignments;

public class SwitchCaseAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "CHRoME";


	switch (browser.toLowerCase()) {
	case "chrome":
		System.out.println("launch chrome");
			break;
	case "firefox":
			System.out.println("launch ff");
		break;
	case "safari":
		System.out.println("launch safari");
		break;
	case "opera":
		System.out.println("launch opera");
		break;

	default:
		System.out.println("please pass the correct browser name...");
		break;
		
	}
	
		// Not possible
//		switch () {
//		case browser.equalsIgnoreCase("chrome"):
//			System.out.println("launch chrome");
//			break;
//		case browser.equalsIgnoreCase("firefox"):
//			System.out.println("launch ff");
//			break;
//		case browser.equalsIgnoreCase("safari"):
//			System.out.println("launch safari");
//			break;
//		case browser.equalsIgnoreCase("opera"):
//			System.out.println("launch opera");
//			break;
//
//		default:
//			System.out.println("please pass the correct browser name...");
//			break;
		}
	

	}


