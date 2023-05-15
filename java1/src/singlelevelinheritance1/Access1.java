package singlelevelinheritance1;


public class Access1 { // Test class
	
		public static void main (String[] args) {

			India1 bharat = new India1();

			bharat.GSLV();
			bharat.Waterfilters();
			bharat.Insulinpump();
			bharat.Spinoff();
			
			System.out.println();
			
			Nasa1 N = new Nasa1 ();
			
			N.Waterfilters();
			N.Insulinpump();
			N.Spinoff();
	}
		
	}

