package FINAL_FINALLY_FINALIZE;

public class FINALLY {

public static void main(String[] args) {
	test1();
	test2();

}

public static void test1() {
	
	try {
		System.out.println("test method"); // yes
	}
	
	catch (NullPointerException e){
		System.out.println("catch block"); //no
		
	}
	finally {
		
		System.out.println("this is finally block"); //yes
	}
}

public static void test2() {
	
	try {
		int a= 6/0;
		
	}
	catch (ArithmeticException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		
		System.out.println("Inside catch block");//yes
		System.out.println("Div by zero");//yes
		
	}
	
	finally {
		System.out.println("finally block");//yes
	}
}

}


