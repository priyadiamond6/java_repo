package OPERATORS;

public class LogicalOperators {

	public static void main(String[] args) {

		
		boolean a = true;
        boolean b = true;
               
        System.out.println(a&&b);
        System.out.println(a||b);
            	
		boolean a1 = true;
        boolean b1 = false;
            
        System.out.println(a1&&b1);  //false
        System.out.println(a1||b1);  // true
        
    	boolean a2 = false;
        boolean b2 = true;
            
        System.out.println(a2&&b2);  //false
        System.out.println(a2||b2);  // true
        
    	boolean a3 = false;
        boolean b3 = false;
            
        System.out.println(a3&&b3);  //false
        System.out.println(a3||b3);  // false
        
	}

}
