package OOP_Interface;


// USMedical is child of WHO
public interface USMedical extends WHO{
	
	int min_fee = 10;// variables we can define in interface
	
	// no method body
	// only method declaration
	// only  method prototype

	public void orthoServices();// Only method declaration no method body
	
	public void neuroServices();

	public void emergencyServices();
	
	public void radioServices();

//	public int test(int a); // we can pass parameter in method and also return type but we can not have method body
	
	// after jdk 1.8:
	//1. can have static methd in interface with body:
	public static void billing() {
		System.out.println("US - biling");
	}
	
	//2. can have default method with method body
	//default -- keyword we need to use 
	
	default void texCollection() {
		System.out.println("US -30% tex collection");
	}
	
}
