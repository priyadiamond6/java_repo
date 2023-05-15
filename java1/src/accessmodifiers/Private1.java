package accessmodifiers;

public class Private1 { //private keyword accessible only within the class

	private int number = 3000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Private1 P1 = new Private1 ();
 
          P1.Udgir();
          P1.Torna();
          System.out.println(P1.number);
	
	}
           private void Udgir () {
        	   System.out.println("Private method - Fort");
           }
        	   private void Torna () {
        		   System.out.println("Private method - Library");
        	   
	
}

           }

