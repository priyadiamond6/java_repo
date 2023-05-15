package Abstraction;

public abstract class AbstractClassConstructor {


		
		public AbstractClassConstructor() {
			
        this (60,90);
       
				
			   System.out.println("Abstract Class Constructor");
		}
			

		private AbstractClassConstructor(int s) {// this - private access modifer cannot be 
			// accessed outside the class so it is called in public access modifier..
        
	
			System.out.println("Private constructor");
		}
		
	    private AbstractClassConstructor(int s, int j) {
		
			System.out.println("Two Private constructor");
		}
		
		
				
	}
