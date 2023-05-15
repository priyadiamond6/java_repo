package VARIABLES;

public class Non_Static_Global_Variables5 {

	int i=30; 
	String SS = "Rahul";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   // System.out.println(i);
	 //  System.out.println(Non_Static_Global_Variables5.i);
		Non_Static_Global_Variables5 SG = new Non_Static_Global_Variables5();
		 System.out.println(SG.i); // non static variable calling by  object name/referencevariable.nonstaticvariable
		 System.out.println(SG.SS);// non static variable calling by  object name/referencevariable.nonstaticstring
		 
		 SG.m2(); // non static method
		 
		// Non_Static_Global_Variables5.m1(); //  static calling by class name.methodname
		 m1();
		 System.out.println();
		 
		 Non_Static_Global_Variables_Different_Class6 NSG =new  Non_Static_Global_Variables_Different_Class6();
		 System.out.println(NSG.age); // non static variable calling from different class by referencename.variablename
		 System.out.println(NSG.name); // non static variable calling from different class by referencename.stringname
		 
	}
		 public static void m1() {
			  
			 Non_Static_Global_Variables5 SG1 =new Non_Static_Global_Variables5();
			 System.out.println(SG1.i); //  non static variable calling from same class by referncename.nonstaticvariable
			 System.out.println(SG1.SS);//  non static variable calling from same class by referncename.nonstaticstring
		
			
	}
		 public void m2() {
			 
			 System.out.println(i); 
			 System.out.println(SS);
		 }
		 
}
