package Abstraction;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Childclass CC = new Childclass (); // static binding
	CC.Demo1();
	CC.Demo2();
	CC.Demo3();
	CC.m1();
		
	System.out.println();
		
	Incompleteclass IC = new Childclass (); //dynamic binding or upcasting or downcasting
	IC.Demo1();// parentclass overrided childclass
	IC.Demo2();
	IC.Demo3();
	//IC.m1();
	
	System.out.println();
	HSBCBank HB = new HSBCBank(); // static binding
	HB.creditcard();
	HB.debitcard();
	HB.funds();
	HB.loan();
	
	System.out.println();
	RBIBank RB = new HSBCBank ();// dynamic binding
    RB.debitcard();
    RB.creditcard();
	RB.loan();

	}

}
