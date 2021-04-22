package ExceptionHandling;

public class TryCatch {
	String name = "Tom";
	
	
	public static void main (String[] args) {

		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatch obj = new TryCatch();
		
		try{
			System.out.println(obj.name);
		int i = 9/0;
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		}
		catch(ArithmeticException e) {
			System.out.println("some exception is coming....");
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming.....");
			e.printStackTrace();
		}
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		

		
	}
}
