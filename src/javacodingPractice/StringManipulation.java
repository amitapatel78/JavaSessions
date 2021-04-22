package javacodingPractice;

public class StringManipulation {

	public static void main(String[] args) {

		String st = "Hi this is my java code and I am so happy";
		System.out.println(st.length());
		System.out.println(st.charAt(0));
		System.out.println(st.charAt(40));
		// System.out.println(st.charAt(41));//IndexOutOfBoundException

		System.out.println(st.indexOf("j"));
		System.out.println(st.indexOf("i"));// 1st occurence
		System.out.println(st.indexOf("i", st.indexOf("i") + 1));// 2nd occurence
	//	System.out.println(st.inde);

		System.out.println(st.indexOf("code"));
		System.out.println(st.indexOf("hello"));// -1

		String mesg = "Welcome null";
		if (mesg.indexOf("admin") > 0) {
			System.out.println("un is there");
		} else {
			System.out.println("un is not there");
		}

		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());

		// trim:
		String s1 = "    hello world    ";
		System.out.println(s1.trim());

		// comparison:
		String s2 = "this is selenium";
		String s3 = "this is selenium";

		System.out.println(s2.equals(s3));

		// contains:
		String message = "this is your email id naveen@gmail.com";
		System.out.println(message.contains("naveen"));
		String url = "http://amazon.com/product/macbook";
		if (url.contains("macbook")) {
			System.out.println("url is correct");
		}

		String a = "testing";
		String b = "selenium";
		int x = 100;
		int y = 200;
		System.out.println(a + b + x + y);
		System.out.println(a.concat(b));

		// substring:
		String m = "your transaction id is 12345 ";
		System.out.println(m.substring(3));
		System.out.println(m.substring(5, 10));
		System.out.println(m.substring(m.indexOf("is") + 2, m.length()).trim());
		System.out.println(m.substring(m.indexOf("is") + 3).trim());

		// split:
		String lang = "JAVA_PYTHON_JAVASCRIPT_RUBY";
		String language[] = lang.split("_");
		System.out.println(language.length);
		for (String e : language) {
			System.out.println(e);
		}
		// Usecase - 
		String userData = "Tom;peter;01-01-1990;NY;USA;909090";
		String user[] = userData.split(";");
		for (String e : user) {
			System.out.println(e);
		}

		String test = "xXtestingxXXjavaXxXseleniumxXxpython";
		String myTest[] = test.split("xX");
		System.out.println(myTest[0]);// blank value 
		System.out.println(myTest[1]);// testing
		System.out.println(myTest[2]);
		System.out.println(myTest[3]);
		System.out.println(myTest[4]);

		String seller = "seller;seller123";
		String username = seller.split(";")[0];
		String pwd = seller.split(";")[1];
		System.out.println(username);
		System.out.println(pwd);

		String logIn = "testing1 test1234 admin";
		System.out.println(logIn.split(" ")[0]);
		
		
		String cred = "testing|test123|admin";
		System.out.println(cred.split("\\|")[0]);
		System.out.println(cred.split("\\|")[1]);
		System.out.println(cred.split("\\|")[2]);
		
		// split - exercise

		String s = "Java.Python.Javascript.C#.C";
		String n[] = s.split("[.]");
		System.out.println(n[0]);

		for (String e : n) {
			System.out.println(e);
		}

	}

}
