package Practice;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		//create 5 memory allocations, each memory will take 4 bytes of memory = 4*5 = 20 bytes of memory
		int student_id[]= new int[5];
		
		student_id[0]=89;
		student_id[1]=45;
		student_id[2]=12;
		student_id[3]=890;
		student_id[4]=980;
		
		System.out.println("Students id is "+student_id[2]);
		
		int sizeofArray=student_id.length;
		System.out.println("Length of arrays is "+sizeofArray);
		// always remember to give exact value 
		
		for (int i=0;i<sizeofArray;i++) { 
			System.out.println("Students id is "+student_id[i]);
		}
		
		String student_id1[]=new String[5];
		student_id1[0]="Paul";
		student_id1[1]="mukesh";
		student_id1[2]="Naveen";
		student_id1[3]="Ruby";
		student_id1[4]="Oleg";
		System.out.println(student_id1[0]);
	}

}
