package Assignments;

public class ArrayAssignment {
	
	public static void main( String[] args) {
//Question 1: Write a program to print the following pattern using for loop:
//
//00 01 02 03 04 05 06 07 08 09 
//10 11 12 13 14 15 16 17 18 19 
//20 21 22 23 24 25 26 27 28 29 
//30 31 32 33 34 35 36 37 38 39 	
		
		for (int i=0;i<4;i++) {  //count of rows
			for (int j=0;j<10;j++) { // count of columns 
				System.out.print(i+""+j+" ");
			}System.out.println();
		}
//Question 2: Write a program to create a static Array, having following cricket data:
//--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
//--Try to create multiple Object Arrays for different players 
//--Try to print all the values of each player on the console using normal for/while loop and for each loop		
		
		Object arr[] = new Object[7];
		arr[0] = "Virat Kohli";
		arr[1] = 33;
		arr[2] = "Indian Cricket team ";
		arr[3] ="Nov 5, 1988";
		arr[4] = 'm';
		arr[5] = 53.42;
		arr[6] = true;		
				
		Object arr1[] = new Object[7];
		arr1[0] = "Axar Patel";
		arr1[1] = 27;
		arr1[2] = "Indian Cricket team ";
		arr1[3] ="Jan 20, 1994";
		arr1[4] = 'm';
		arr1[5] = 13.25;
		arr1[6] = true;		
		
		Object arr2[] = new Object[7];
		arr2[0] = "Washington Sundar";
		arr2[1] = 22;
		arr2[2] = "Indian Cricket team ";
		arr2[3] ="Oct 5, 1999";
		arr2[4] = 'm';
		arr2[5] = 42.25;
		arr2[6] = true;		
		
	// For each loop 	
		for(Object e : arr) {
			System.out.println(e);
		}System.out.println("-----------");
		for(Object f : arr1) {
			System.out.println(f);
		}System.out.println("-----------");
		for(Object g : arr2) {
			System.out.println(g);
		}System.out.println("-----------");
	// for loop 	
		for (int p=0;p<arr.length;p++) {
			System.out.println(arr[p]);
		}System.out.println("-----------");
		for (int q=0;q<arr1.length;q++) {
			System.out.println(arr1[q]);
		}System.out.println("-----------");
		for (int r=0;r<arr2.length;r++) {
			System.out.println(arr2[r]);
		}System.out.println("-----------");
		
	//while loop 
		
		int s=0;
		while(s<arr.length) {
		System.out.println(arr[s]);
			s++;
		}System.out.println("-----------");
		int t=0;
		while(t<arr1.length) {
		System.out.println(arr1[t]);
			t++;
		}System.out.println("-----------");
		int u=0;
		while(u<arr2.length) {
		System.out.println(arr2[u]);
			u++;
		}System.out.println("-----------");	
	}
}
	


