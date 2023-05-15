package Logical_Program_Practice;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Universe";
	
		for (int i=a.length()-1; i>=0; i--) {
			System.out.println(a.charAt(i));
		}

		System.out.println();
		
	
		for (int i=0; i<=a.length()-1; i++) {
			System.out.println(a.charAt(i));
		}
	}

}
