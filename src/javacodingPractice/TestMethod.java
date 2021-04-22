package javacodingPractice;

public class TestMethod {
	
	public static void main(String[] args) {
		
		MethodChaining obj = new MethodChaining(); // this is a different class 
		obj.m1();
		obj.name = "BMW";
		System.out.println(obj.name);
		
		MethodChaining.t1(); // we can not call directly static method we need to call through class name
	//	t1(); //it will not allow 
		System.out.println(MethodChaining.wheels);// Variables also we need to call through class name 

	}
}
