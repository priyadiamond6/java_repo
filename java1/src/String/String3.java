package String;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// diff btwn == operator and .equals method
		
		String S1 = new String("Automation");
		String S2 = new String ("Automation");
		
		System.out.println(S1==S2); // false // here reference or id(address) are different
		
		System.out.println(S1.equals(S2)); //True// here characters or literals match
		
		String S3 = "Java";
		String S4 = "Java";
		
	
		
		System.out.println(S3==S4); // True// here reference or id(address) are same
		
		System.out.println(S3.equals(S4));// True // here characters or literals are same
		
		String S5 = "Priyanka";
		String S6 = "Rohini";
		
		System.out.println(S5==S6);
	    System.out.println(S5.equals(S6));
	
		/* - == Always compare reference comparison/address comparison
		 * ref comparison means if both refer point to the same obj(string)then it will give true */
			
		/* .equal = content comparison means compare the two given string based on the content of the stirng
		 * .
		 * if any char is not matched ,it will returns false,if all char are matched. it will return true.
		 */
		
	}

}
