package package1;

public class Sample11 {

	

			public static void main(String[] args) {  // Main Method body

				System.out.println("Good morning");
				
				//Static regular method calling from same class
				
				//1.Direct calling
				//syntax - Methodname();
				m1();
				m2();
				
				//2.Calling by name
				//Synatx  - Classname.methodname();
				
			}
			
			  public static void m1() {
				
				System.out.println("Static regular method calling from same class :m1");
				
			}
			
		      public static void m2() {
				
				System.out.println("Static regular method calling from same class :m2");
				
			}

		

	}


