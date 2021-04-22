package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		System.out.println("Hi");
		
		try {
			int i = 9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ARE is coming.....");
		}
		
		finally {
			System.out.println("Im inside finally block....");
			System.out.println("close the DB connection....");
		}
		int n1 = getMarks("Tom");
	}

	
	public static int getMarks(String name) {

		if (name.equals("Tom")) {
			try {
				int i = 9 / 0;
			} catch (Exception e) {
				return 80;
			} finally {
				return -1;
			}
		}

		return 10;
	}
}