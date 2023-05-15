package MainMethod;

public class Void1 {

	public static int addition(int a,int b) { // this is for 1o no line
		
		int sum =a+b;
		System.out.println(sum);
		return sum;
		
	}
	
	public static void m2() {
		
		System.out.println(addition(30, 20));
	}
	
	public static void m3() {
		
		System.out.println(addition(40,60));
		
	}
	
	public static void main(String[] args) {
		
    //int Test = addition(20, 30);
	
		int Test = addition(20, 30);
		
		System.out.println(Test); // this is for line no 23 and 24
		
		m2();
		
		m3();
	}
	
	/*if u want a method return value u can declared a data type such int string char etc.
			instead of void and add return keyword inside the method */
}
