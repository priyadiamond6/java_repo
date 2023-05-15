package Polymorphism;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Car c = new Car (); // static binding
 
 c.Start();
 c.Stop();
 c.Refuel();
 
 System.out.println();
 
 Kia K1 = new Kia ();// static binding
 
 K1.Start();
 K1.Stop();
 K1.Refuel();
 K1.Theftsafety();
 
 System.out.println();
 
 Car C1 = new Kia();// dynamic binding / upcasting / top casting
 C1.Start();// kia -- Start
 C1.Stop();//Kia -- Stop
 C1.Refuel();//Kia -- Refuel//
 
 Kia K2 = (Kia) new Car();// class cast exception// downcasting here
 K2.Start();
K2.Stop();
K2.Refuel();
K2.Theftsafety();
 
 	}
}