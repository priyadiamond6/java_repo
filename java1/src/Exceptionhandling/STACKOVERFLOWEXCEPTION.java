package Exceptionhandling;

public class STACKOVERFLOWEXCEPTION {

public static void main(String[] args) {

		
	System.out.println("Hello");
	Name(6);
		
	}

	public static int Name (int a) {
		

		return Name(a)+5;
	}
}


