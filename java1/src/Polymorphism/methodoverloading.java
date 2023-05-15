package Polymorphism;
// compile time polymorphism
public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 methodoverloading mo = new methodoverloading();
 
 mo.m1();
 mo.m1(30);
 mo.m1(44l);
 mo.m1(5673d);
	}
	
	public void m1() {
		System.out.println("no args para");
	}

	public void m1(int a) {
		System.out.println("one para");
	}
	
	public void m1(long b) {
		System.out.println("long para");
	}
	
	public void m1(double s) {
		System.out.println("double argument");
	}

}
