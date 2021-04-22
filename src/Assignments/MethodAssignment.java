package Assignments;

public class MethodAssignment {
	
//1. Write a program to print the sum of two numbers entered by defining your own method.
	
	public static void sum() {
		int x = 30;
		int y = 40;
		int z = x+y;
		System.out.println("sum of two number is " + z);
	}
	
	
//2. Define a method that returns the product of two numbers entered 	
	public int sumoftwonumbers() {
		System.out.println("get numbers");
		int a = 50;
		int b = 40;
		int c = a+b;
		return c;
		
	}
// 3.Write a program to print the circumference and area of a circle of radius entered by defining your own method.	
	public static void circle() {
		
		int radius = 1;
		double area = Math.PI*(radius*radius);
		double circumference = Math.PI*2*radius;
		System.out.println("circumference is " +circumference +""+ "and area is  " + area);
	}
//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered.
	
	public int Max (int first, int second, int third) {
		int max = first;
		if (second>max) {
			max = second;
		}
		if (third>max) {
			max =third;
		}
		return max;
	}
	
	public int Min(int first, int second, int third) {
		int min = first;
		if (second < min) {
			min = second;
		}
		if (third < min) {
			min = third;
		}
		return min;
	}
//5. Define a program to find out whether a given number is even or odd.
	public int evenOrOdd(int a) {
		if (a % 2 == 0) {
			System.out.println("The number is even ");
		} else {
			System.out.println("The number is odd ");
		}
		return a;
	}
	
//6. A person is elligible to vote if his/her age is greater than or equal to 18. 
//Define a method to find out if he/she is elligible to vote.	
	
	public int vote(int age) {
		if (age>=18) {
			System.out.println("Age is greater than equal to 18 then person is eligible");
		}
		else if (age<18){
			System.out.println("Age is less than 18 then person is not eligible");
		}
		else {
			System.out.println( "Not a valid age");
		}
		return age;
	}
	
//7. Write a program which will ask the user to enter his/her marks (out of 100). 
//Define a method that will display grades according to the marks entered as below:
	//Marks        Grade
	//91-100         AA
	//81-90          AB
	//71-80          BB
	//61-70          BC
	//51-60          CD
	//41-50          DD
	//<=40          Fail	
	
	public String grades(int marks) {
		String grade = "";
		 
		if (marks >= 91 && marks <= 100) {
			grade = "AA";
		} else if (marks >= 81 && marks <= 90) {
			grade = "AB";
		} else if (marks >= 71 && marks <= 80) {
			grade = "BB";
		} else if (marks >= 61 && marks <= 70) {
			grade = "Bc";
		} else if (marks >= 51 && marks <= 60) {
			grade = "CD";
		} else if (marks >= 41 && marks <= 50) {
			grade = "DD";
		} else if (marks <= 40) {
			grade = "Sutdent is Fail";
		}
		return grade;
	}
	
//8. Write a program to print the factorial of a number by defining a method named 'Factorial'.
//The Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//4! = 1*2*3*4 = 24
//3! = 3*2*1 = 6
//2! = 2*1 = 2
//Also,
//1! = 1
//0! = 1
	
	public int factorial(int n) {
//		if (n==0)
//			return 1;
//		
//		return n* factorial(n-1);
		
		int k = 1;
		while (n > 0) {
			k = k * (n);
			n = n - 1;
		}
		return k;
	}

	public static void main(String a[]) {
		// to call all the class methods (non static), we have to create the object of
		// the class:

		sum();// 1. Write a program to print the sum of two numbers entered by defining your
				// own method.
		
		MethodAssignment obj = new MethodAssignment();
		int sum = obj.sumoftwonumbers();
		System.out.println("sum of two numbers " + sum); // 2. Define a method that returns the product of two numbers
															// entered

		circle();// 3.Write a program to print the circumference and area of a circle of radius
					// entered by defining your own method.

		int m = obj.Max(30, 40, 50); 
		System.out.println(" Max of three number is " + m); // 4. find max number
		int n = obj.Min(30, 40, 50);
		System.out.println(" Min of three number is " + n); // 4. find min number
		
		int num = obj.evenOrOdd(30);
		System.out.println("And the number is " + num ); // 5. Number is even or Odd
		
		int i = obj.vote(17);
		System.out.println("Persons age is " + i);// 6. Person eligible is vote or not
		
		int marks = 65;
		String g = obj.grades(marks);// 7.Student grade
		System.out.println("Student marks is " + marks  + " and grade is " + g);
		
		int j = 4;
		int f = obj.factorial(j);
		System.out.println("Factorial of number " + j + " is " + f );
		
		
	}

}
//1.Write a program to print the sum of two numbers entered by defining your own method.
//
//2. Define a method that returns the product of two numbers entered 
//________________________________
//3.Write a program to print the circumference and area of a circle of radius entered by defining your own method.
//________________________________
//
//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered.
//________________________________
//
//5. Define a program to find out whether a given number is even or odd.
//________________________________
//
//6. A person is elligible to vote if his/her age is greater than or equal to 18. 
//Define a method to find out if he/she is elligible to vote.
//________________________________
//
//
//7. Write a program which will ask the user to enter his/her marks (out of 100). 
//Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
//________________________________
//
//8. Write a program to print the factorial of a number by defining a method named 'Factorial'.
//The Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//4! = 1*2*3*4 = 24
//3! = 3*2*1 = 6
//2! = 2*1 = 2
//Also,
//1! = 1
//0! = 0