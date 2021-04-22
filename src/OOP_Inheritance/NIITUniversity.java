package OOP_Inheritance;

public class NIITUniversity extends University {
	
	@Override
	public void startdate() {
		System.out.println("NIIT --- startdate");
	}
	
	@Override
	public void admissiondate() {
		System.out.println("NIIT --- admissiondate");
	}
	
	@Override
	public void examdate() {
		System.out.println("NIIT -- Examdate");
	}
	
	
	public void enddate() {
		System.out.println("NIIT -- enddate");
	}
	@Override
	public void admission() {
		System.out.println("central --- admission");
	}
	
	public static void graduationdate() {
		System.out.println("NIIT -- graduationdate");
	}
}
