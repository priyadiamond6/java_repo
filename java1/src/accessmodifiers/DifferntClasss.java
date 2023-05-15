package accessmodifiers;

public class DifferntClasss {// public keyword (access modifier) accesible outside class i.e. 
// in class DiffernetClass.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Public1 P2 = new Public1();
		P2.Tirupati();
		P2.Assam();
		
// Private1 P1 = new Private1 ();//not accessible coz private keyword accessible only within the class 
// P1.Udgir();//not accessible coz private keyword accessible only within the class
// P1.Torna();//not accessible coz private keyword accessible only within the class
// System.out.println(P1.number);//not accessible coz private keyword accessible only within the class
		 
		Default1 d1 = new Default1();// default keyword accessible within package means difft class within package
		d1.Netherlands();
		d1.Alaska();
		System.out.println(d1.no);
		
		Protected1 P = new Protected1();
		P.Home();
		P.Garden();
		System.out.println(P.s);
	}
	}


