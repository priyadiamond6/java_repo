package Exceptionhandling;

public class FINALLY {

	public static void main(String[] args) {
		
		String name = null;
		
		try {
	System.out.println(name.length());

	}
		catch (NullPointerException P){
			System.out.println(P.getMessage());
			P.printStackTrace();
		}
		
		finally {
			System.out.println("this is finally block");
		}

	}
}
