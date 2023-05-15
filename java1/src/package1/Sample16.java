package package1;

public class Sample16 {

	

	public static void main(String[] args) {

		
		// Non-static regular method calling from same class
		
		System.out.println("Main method started");
		
		//Directcalling by methodname   - not allowed
//		m5();
//		m6();
		
	//	Caalling by class name
		
//		Sample5.m5();
//		Sample5.m6();
		
		//Object creation
	//	synatx - Classname referancevariablename = new Classname();
		
		  Sample16 obj = new Sample16();
		  
		  //Calling nonstatic method
		  //syntax - RVname.methodname();
		  obj.m5();
		  obj.m6();
		  obj.m7();
		
  //		  obj.m7(); 
		  
	//	  Question - Can i access static method by using object RV name
	//	  ans - Yes, we can access static method but it will give one warning message
		  
		System.out.println("Main method endeds");
	}
	
	public void m5() {
		System.out.println("Non static method calling from same class :m5");
	}
	
	public void m6() {
		System.out.println("Non static method calling from same class :m6");

	}
	public  void m7() {
		System.out.println("Static method");
	}

}