package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		try {
			throw new Exception("Some Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		String data = "";
		if (data.equals("")) {
			try {

				throw new Exception("Data blank exception");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("data is coming blank from the backend/excel");
				System.out.println(e.getMessage());
			}

		}
	}
}