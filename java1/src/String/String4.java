package String;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1 = new String ("Java");
		String S2 = new String ("Java");
		String S3 = "Java";
		String S4 = "Java";
		String S5 = "Selenium";
		String S6 = new String ("Java");
		
		System.out.println(S1==S2); // false
		System.out.println(S1==S3); // false
		System.out.println(S3==S4); // true
		
		System.out.println(S1.equals(S2)); // true
		System.out.println(S1.equals(S6)); // true
		System.out.println(S1.equals(S5)); // false
	}

}
