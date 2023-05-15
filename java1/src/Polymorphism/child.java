package Polymorphism;

public class child extends father {

	public void Mobile () {
		System.out.println("Mobile--OnePlus");
	}
	@Override
	public void car () {
		System.out.println("Car--kia");
	}
	@Override
	public void m1 () {
		System.out.println("Parent class m1 method :: m2");
	}
	
	public void m2() {
		System.out.println("Child class m2 method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   child c1 = new child ();//static polymorphism / static binding
   c1.car();
   c1.m1();
   c1.m2();
   c1.Mobile();
   c1.Money();
   c1.Home();
   
   System.out.println();
   
  father f1 = new child();// dynamic binding/up casting/top casting
  f1.car(); // swift
  f1.Money(); // 1 lakh
  f1.Home(); // 2BHK
  f1.m1(); // m1
   System.out.println();
  father f2 = new father();// static binding
  f2.car();
  f2.Home();
	}

}
