package LogicalProgram;

public class Stringpalindrome {

	public static void main(String[] args) {
//    String s = "oyo";
//    String rev = "";
    String s = "oyot";
    String rev = "";
    
    for (int i=s.length()-1; i>=0;i--) {
    	
    	rev =rev+s.charAt(i);
    }
        System.out.println(rev);
        
     if (s.equals(rev)) {
    	  System.out.println("given string is palindrome");
     }
    	  else {
    		  System.out.println("Given String is not palindrome");;
    	  }
    	  
	}
        
	}


