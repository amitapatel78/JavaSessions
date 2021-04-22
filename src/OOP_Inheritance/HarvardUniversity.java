package OOP_Inheritance;

public class HarvardUniversity extends University {
	
	
	@Override
	public void admissiondate() {
		System.out.println("Harvard --- admissiondate");
	}
	
	@Override
	public void examdate() {
		System.out.println("Harvard -- Examdate");
	}
	
	public void teacherCount() {
		System.out.println("Harvard -- teacherCount");
	}
	

}
