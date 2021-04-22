package JavaInterviewQuestions;

import java.util.Scanner;

public class BasicJavaInterviewQuestions {
	public static void main(String[] args) {

	// 1. java program to Print an integer (Entered by the user)
			Scanner reader = new Scanner(System.in);
			System.out.println(" please enter a number: ");
			
			int num = reader.nextInt();
			System.out.println("You entered: " + num);
			
	// 2. Java program to add two integers 
			int a = 20;
			int b = 10;
			
			System.out.println("Sum of a and b is : " + (a+b));
			
	// 3. Java program to Multiply two floating Point Numbers 
			
			float c = 12.35f;
			float d = 13.33f;
			
			float total =c * d;
			
			System.out.println("Multiplication of two floating point numbers: " + total);
			
			
	}
}