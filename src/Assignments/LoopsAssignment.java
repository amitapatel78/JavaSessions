package Assignments;

public class LoopsAssignment {

	public static void main(String[] args) {
		
//1. WAP to print following output: I am batman (5 times)
		
		for (int a=1;a<=5;a++) {
			System.out.println("I am batman");
		}
		
//2. WAP to print following output:I am Batman 1 to I am Batman 9
		
		for (int p=1;p<10;p++) {
			System.out.println("I am batman " + p);
		}
		
//3. WAP to print 10 to 1 using for, while and do-while loop
		for(int i=10;i>=1;i--) {
			System.out.println("Print with for loop " +i);
		}
		
		int j=10;
		while(j>=1) {
			System.out.println("Print with while loop " +j);
			j--;
		}
		
		int k=10;
		do {
			System.out.println("Print with do while loop "+k);
			k--;
		}while (k>=1);
		
		
// 4. Write a program in Java to print "Hello World" ten times using while loop
		
		for (int r=0; r<10; r++) {
			System.out.println("Print Hello world 10 times with for loop");
		}
	
		int counter = 1;
		while (counter<=10) {
			System.out.println("Print Hello world 10 times with while loop");
			counter++;
		}	
//5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered	
		 
		int s=1;
		while(s<=10) {
			System.out.println(s);
			
			if (s%7==0) {
				System.out.println("multiple of 7 found");
				break;
			}
			s++;
			}
		
//6. Print even number (0 2 4 6 8 10) using for/while/dowhile loop.
		
		for (int a=0;a<=10;a=a+2) {
			System.out.println("Print even number with for loop " +a);
		}
		
		int b=0;
		while(b<=10) {
			System.out.println("Print even number with while loop " +b);
			b=b+2;
		}
		
		int c=0;
		do {
			System.out.println("Print even number with do while loop " +c);
			c=c+2;
		}while(c<=10);
		
//7. Print odd number (1 3 5 7 9) using for/while/dowhile loop.
		
		for(int d=1;d<=10;d=d+2) {
		System.out.println("Print odd number with for loop " +d);
		}
		
		int e=1;
		while(e<=10) {
			System.out.println("Print odd number with while loop " +e);
			e=e+2;
		}
		
		int f=1;
		do {
			System.out.println("Print odd number with do while loop "+f);
			f=f+2;
		}while(f<=10);
		
		
// Print even or odd number 
		
		
	}
}		
	
		
		
		
		
//		1. WAP to print following output:
//			I am Batman
//
//			I am Batman
//
//			I am Batman
//
//			I am Batman
//
//			I am Batman
//
//
//
//			2. WAP to print following output:
//			I am Batman 1
//
//			I am Batman 2
//
//			I am Batman 3
//
//			I am Batman 4
//
//			I am Batman 5
//
//			I am Batman 6
//
//			I am Batman 7
//
//			I am Batman 8
//
//			I am Batman 9
//
//
//			3. WAP to print 10 to 1 using for, while and do-while loop
//
//			4. Write a program in Java to print "Hello World" ten times using while loop
//
//			5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
//
//			6. Print even number (0 2 4 6 8 10) using for/while/dowhile loop.
//
//			7. Print odd number (1 3 5 7 9) using for/while/dowhile loop.



