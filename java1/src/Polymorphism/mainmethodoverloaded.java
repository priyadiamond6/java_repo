package Polymorphism;
// compile time polymorphism
public class mainmethodoverloaded { // main method overloading concept or 
	                                //ex of overloading of main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   mainmethodoverloaded MO = new mainmethodoverloaded();
   MO.m1();
   MO.m2();
   
   int arr [] = {12};
   
   main(arr);
	}
   public static void main (int [] args) {
   mainmethodoverloaded MO = new mainmethodoverloaded();
   MO.m1();
   MO.m2();
	}
   
   public void m1() {
	   System.out.println("M1 method");
   }
   
   public void m2() {
	   System.out.println("M2 method");
   }
	
	
}