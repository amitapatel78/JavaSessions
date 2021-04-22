package Assignments;

public class MethodAssignmentSwitchCase {
	
	// WAF where you have to pass the studentname(String) and Return Marks (integer)
	
	public int getStudentMarks (String studentname) {
		System.out.println("getting the marks for "+ studentname);
		int marks = -1;
				switch (studentname) {
				case "Tom": 
					marks = 90;
					break;
				case "Anu":
					marks = 95;
					break;	
				case "Raj":
					marks = 80;
					break;		
						
				default:
					System.out.println(studentname + " is not present");
					break;
				}
				return marks;
		
	}

	public static void main(String[] args) {

		MethodAssignmentSwitchCase obj = new MethodAssignmentSwitchCase();
		int m1 = obj.getStudentMarks("Tom");
		System.out.println("student mark is " + m1);
		
			
		
		
		
		


	}

}
