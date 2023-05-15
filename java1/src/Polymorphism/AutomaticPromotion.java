package Polymorphism;

public class AutomaticPromotion {

public static void main(String[] args) {

		AutomaticPromotion AP =new AutomaticPromotion();
		
         AP.m1();
		AP.m1(-32768);
		//AP.m1(11);
		AP.m1(6995L);
		AP.m1(11.3d);
		AP.m1('A');
		AP.m1(77.5f);
		AP.m1(-100);
	    
	}
	
	public void m1() {
		System.out.println("Zero i/p para mehtod");
	}
	public void m1(short s) {
		System.out.println("short args method");
	}
//  public void m1(int i) {
//  System.out.println("int argument method");
//}
	public void m1(long l) {
		System.out.println("Long argument method");
	}
	public void m1(double d) {
		System.out.println("Double argument method");
}
	public void m1 (char c) {
	System.out.println("char args method");
}
	public void m1 (float f) {
		System.out.println("float args method");
	}
	public void m1 (byte b) {
	System.out.println("byte args method");
}
}


