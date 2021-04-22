package numberTest;

public class Encaptest {

	public static void main(String[] args) {
		Number n = new Number();
		n.setY(6);
		int num = n.getY();
		System.out.println(num);

		n.setStdid(1005);
		int id= n.getStdid();
		System.out.println(id);
		
		n.setStdName("Ruby");
		String name = n.getStdName();
		System.out.println(name);
		
		n.setStdRollNo(105);
		int r = n.getStdRollNo();
		System.out.println(r);
	}

}
