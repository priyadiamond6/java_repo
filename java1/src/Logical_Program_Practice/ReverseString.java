package Logical_Program_Practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Siddharth";
		
		for (int i=s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
		System.out.println();
		for (int i=0; i<=s.length()-1; i++) {
			System.out.println(s.charAt(i));
		}
	}

}
