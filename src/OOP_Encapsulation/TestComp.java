package OOP_Encapsulation;

public class TestComp {

	public static void main(String[] args) {
	
		Company c1 = new Company();
		c1.setName("IBM");
		System.out.println(c1.getName());
		
		c1.setPolicy("IBM");
		c1.setSharePrice(100);
		System.out.println(c1.getName() +" "+ c1.getPolicy()+" "+c1.getSharePrice());
		
		
		
	}

}
