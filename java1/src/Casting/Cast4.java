package Casting;

public class Cast4 extends Cast3 {

	public void Test3() {
		System.out.println("Test3 - method");
	}
	 
			public static void main (String[]args) {
				 Cast4 C3 = new Cast4();
				 
				 C3.Test1();
				 C3.Test2();
				 C3.Test3(); 
				  System.out.println();
				  
				 Cast3 C4 = new Cast4(); // upcasting
				 
				 C4.Test1();
				 C4.Test2();
				 
				 System.out.println();
				 
				 Cast4 C5 =  (Cast4) new Cast3(); // downcasting // class cast exception
				 
				 C5.Test1();
				 C5.Test2();
				 C5.Test3();
				 
				
			}
	}
