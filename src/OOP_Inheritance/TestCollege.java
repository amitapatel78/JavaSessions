package OOP_Inheritance;

public class TestCollege {

	public static void main(String[] args) {
		NIITUniversity NU = new NIITUniversity();
		NU.startdate();
		NU.admissiondate();
		NU.examdate();
		NU.enddate();
		NU.admission();
		NIITUniversity.graduationdate();
		
		System.out.println("______________");
		
		Yorkuniversity YU = new Yorkuniversity(); 
		YU.startdate();
		YU.admissiondate();
		YU.admission();
		YU.studentResidenceavaila();
		
		System.out.println("_____________________");
		
		HarvardUniversity HU = new HarvardUniversity();
		HU.admissiondate();
		HU.examdate();
		HU.teacherCount();
		
		System.out.println("__________________");
		//Top casting
		University U = new NIITUniversity();
		U.startdate();
		U.admissiondate();
		U.examdate();
		
		
		CentralUnvi CU = new NIITUniversity();
		CU.admission(); // Grand parent reference  
		
			
		

	}
	
	

}
