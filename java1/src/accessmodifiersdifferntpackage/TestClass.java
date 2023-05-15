package accessmodifiersdifferntpackage;

import accessmodifiers.Default1;
import accessmodifiers.Private1;//Private1 class called from different pacakge by using 
import accessmodifiers.Protected1;//Protected class from different pacakge only called by 
//using extends keyword
//import keyword
import accessmodifiers.Public1;// Public1 class called from different pacakge by using 
//import keyword

public class TestClass extends Protected1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Public1 P1 = new Public1();
		P1.Tirupati();
		P1.Assam();
			
//Private1 P2 = new Private1();//not accessible coz private keyword not accessible outside the package 
			
//P2.Udgir();
//P2.Torna();
		//Default1 d1 = new Default1();// default keyword accessible within package means difft class within package
		//d1.Netherlands();
		//d1.Alaska();
		//System.out.println(d1.no);
		
//        Protected1 P = new Protected1();
//		P.Home();
//		P.Garden();
//		System.out.println(P.s);
		
		TestClass TC = new TestClass();
		TC.Home();
		TC.Garden();
		System.out.println(TC.s);
		}
		
	}


