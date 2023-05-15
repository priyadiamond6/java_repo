package Polymorphism;

public class StaticMethod2 extends StaticMethod1 {
	
	public static void m1() { // cannot override static method
		
		System.out.println("Static method : Child Class");
	}
	@Override
	public void m2() {
		
		System.out.println("Non static method : Child Class");
	}
	
	public static void main(String[] args) {
		
		StaticMethod1 SM1 = new StaticMethod1();// class and object of same class
			
		SM1.m1(); // static binding   
		SM1.m2();
		
		System.out.println();  // static binding or early binding
		StaticMethod2  SM2  =new StaticMethod2();
		
		SM2.m1();//static binding
		SM2.m2();
		
		System.out.println();
		StaticMethod1 SM3 =new StaticMethod2();  //Method hidings// dynamic binding
		
		SM3.m1();// cannot override static method 
		SM3.m2();// child class over-rided parent class
	}

}
