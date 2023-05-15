package Abstraction;
public class AbstractSubclass extends AbstractClassConstructor {

	     public AbstractSubclass() {
	    	 
	    	super(); // used to call the parent class constructor
	    	 
	       System.out.println("Subclass Constructor");  
	     }
		public static void main(String[] args) {
				
			AbstractSubclass  Ab = new AbstractSubclass();
			//AbstractClassConstructor ACC = new AbstractSubClass();
		}
	}
