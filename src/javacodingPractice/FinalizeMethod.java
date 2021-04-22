package javacodingPractice;

public class FinalizeMethod {

	String name = "Tom";
	public static void main(String[] args) {
		
//		FinalizeMethod obj = new FinalizeMethod(); 
//		obj = null;
		
		Window w1 = new Window();
		w1 = null;
		System.gc();// to call garbage collector - garbage collector will call finalize method before destroying the object
			
	}
	
	@Override
	public void finalize() {
		System.out.println("FinalizeMethod -- finalize");
	}
	

}
