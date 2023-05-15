package CONSTRUCTOR1;

public class DefaultConstructor {
 
	 DefaultConstructor() { // default means without using keyword ex- public (applicable access modifiers), 
		                   //then too program is executed.....it is called default constructor.

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultConstructor DC = new DefaultConstructor();
		
		DC.m1();
		DC.m2();
	}
	public void m1() {
		System.out.println("Zero parameter method");
	}
	
	public void m2() {
		int a = 80;
		int b =70;
		int add =a+b;
		System.out.println(add);
	}
	
}
