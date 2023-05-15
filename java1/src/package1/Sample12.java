package package1;
// Ranjeet sir
public class Sample12 {  // class body

	public static void main(String[] args) {  // Main Method body

		System.out.println("Main method started");
		
		//Static regular method calling from same class
		
		//1.Direct calling by method name
		
		//syntax - Methodname();
		m1();
		m2();
		
		//2. Calling by classnameand method name
		//Synatx  - Classname.methodname();
		  
		Sample12.m1();
		Sample12.m2();
		
		System.out.println("Main method ended");	
	}
	
	  public static void m1() {
		
		System.out.println("Static regular method calling from same class :m1");
		
	}
	
      public static void m2() {
		
		System.out.println("Static regular method calling from same class :m2");
		
	}

}