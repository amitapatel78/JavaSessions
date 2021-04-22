package javacodingPractice;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	4. Write a Java program to test a person is eligible for vote
//		age is greater than equal to 18 and alive: eligible 
//		age is less than to 18 and alive: not eligible
//		if not alive: print person does not exist.
		
		int age = 17 ;
		String alive = "no";
		
		System.out.println("To test a person is eligible for vote");
		if (age>=18 && alive =="yes") {
			System.out.println("Age is greater than equal to 18 and alive: eligible");
		}else if(age<18 && alive == "yes") {
			System.out.println("Age is less than to 18 and alive: not eligible");
		}else if(alive=="no") {
			System.out.println("if not alive: print person does not exist");
		}else {
			System.out.println("invalid age or alive status");
		}

		System.out.println("-------------------------------------------------------------");
		
		int age1 = 18 ;
		String alive1 = "no";
		
		System.out.println("To test a person is eligible for vote");
		if (alive1=="no") {
			System.out.println("if not alive: print person does not exist");
		}
		
		else if(alive1=="yes") {
			if (age1>=18) {
				System.out.println("Age is greater than equal to 18 and alive: eligible");
			}else if(age1<18) {
				System.out.println("Age is less than to 18 and alive: not eligible");
		}
			else {
				System.out.println("invalid alive value");
			}
	
		}

	}

}
