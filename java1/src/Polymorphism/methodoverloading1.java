package Polymorphism;
// compile time polymorphism
public class methodoverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    methodoverloading1 mo1 = new methodoverloading1 ();
    mo1.Addition(40,60);
    mo1.Addition(50,60,70);
    
    m1();
    m1(500);
	}
	public void Addition (int a, int b) {
	int sum = a+b;
	System.out.println(sum);
	}
	
	public void Addition (int a, int b, int c) {
		int sum = a+b-c;
		System.out.println(sum);
	}
	
	public static void m1 () {
		System.out.println("zero input parameter");
	}
	
	public static void m1 (int a) {
		System.out.println("one input para method");
		

	}
}
