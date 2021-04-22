package Assignments;

import java.util.Scanner;

public class ConditionalOperatorsAssignment {

	public static void main(String[] args) {


//1. Take three numbers from the user and print the greatest number. 
		System.out.println("1. Take three numbers from the user and print the greatest number. ");
		Scanner reader = new Scanner(System.in);
		System.out.println("Input the 1st number: ");
		int num1 = reader.nextInt();
		System.out.println("Input the 2nd number: ");
		int num2 = reader.nextInt();
		System.out.println("Input the 3rd number: ");
		int num3 = reader.nextInt();

		if (num1>num2 && num1>num3) //false & false = false
			{
			System.out.println("Expected Output :\n The greatest: " + num1);
			}
		else if (num2>num3) // false = false
			{
			System.out.println("Expected Output :\n The greatest: " + num2);
			}
		else {
			System.out.println("Expected Output :\n The greatest: " + num3);
			}
		System.out.println("------------------------------------------------");
//2. Take four numbers from the user and print the greatest number. 
		System.out.println("2. Take four numbers from the user and print the greatest number. ");
		System.out.println("Input the 1st number: ");
		int num4 = reader.nextInt();
		System.out.println("Input the 2nd number: ");
		int num5 = reader.nextInt();
		System.out.println("Input the 3rd number: ");
		int num6 = reader.nextInt();
		System.out.println("Input the 3rd number: ");
		int num7 = reader.nextInt();

		if (num4>num5 && num4>num6 && num4>num7) //false & false = false
			{
			System.out.println("Expected Output :\n The greatest: " + num4);
			}
		else if (num5>num6 && num5>num7) // false = false
			{
			System.out.println("Expected Output :\n The greatest: " + num5);
			}
		else if (num6>num7) {
			System.out.println("Expected Output :\n The greatest: " + num6);
			}
		else {
			System.out.println("Expected Output :\n The greatest: " + num7);
			}
		
		System.out.println("------------------------------------------------");
//3. Write a Java program to test a number is positive or negative.
		System.out.println("3. Write a Java program to test a number is positive or negative.");
		int a = 35; // a = -11;
		
		if (a>=0) {
			System.out.println("Input number is a positive number: " + a);
		}else {
			System.out.println("Input number is a negative number: " + a);
		}
		System.out.println("------------------------------------------------");
//4. Write a Java program to test a person is eligible for vote		
		System.out.println("4. Write a Java program to test a person is eligible for vote");
		
		int age = 18 ;
		String alive = "yes";
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
		
		
//		1. Take three numbers from the user and print the greatest number. 
//
//		Test Data
//		Input the 1st number: 25 
//		Input the 2nd number: 78 
//		Input the 3rd number: 87
//		Expected Output :
//		The greatest: 87
//
//		2. Take four numbers from the user and print the greatest number. 
//
//		Test Data
//		Input the 1st number: 25 
//		Input the 2nd number: 78 
//		Input the 3rd number: 87
//		Input the 4th number: 91
//		Expected Output :
//		The greatest: 91
//
//
//
//		3. Write a Java program to test a number is positive or negative.
//
//		Test Data
//		Input number: 35 -- positive number
//		Input number: -11 -- negative number
//
//
//		4. Write a Java program to test a person is eligible for vote
//		age is greater than equal to 18 and alive: eligible 
//		age is less than to 18 and alive: not eligible
//		if not alive: print person does not exist.

		
		
		
		
	}


