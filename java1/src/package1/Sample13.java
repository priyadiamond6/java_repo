package package1;


// Ranjeet Sir 

public class Sample13 {

	 

			public static void main(String[] args) {
				System.out.println("Main method started");
				
		 //1. Direct calling
				staticmethod1();
				staticmethod2();
				
		  //2. Calling class name and method name 
				Sample13.staticmethod1();
				Sample13.staticmethod2();
				
				System.out.println("Main method ended");	
			}

			
			public static void  staticmethod1() {
				
				System.out.println("Static method :1");
			}
			
			public static void staticmethod2() {
				System.out.println("Static method :2");
			}
		}
