package CONSTRUCTOR1;

public class Rulesofconstructor {
 
	    public Rulesofconstructor() {
		System.out.println("No args const");
	    }
	    
		public Rulesofconstructor(int a) {
		System.out.println("one args const");
		}
		
		public Rulesofconstructor(String b) {
		System.out.println("String args constant");
		}
		
		public Rulesofconstructor(int a,int b) {
			System.out.println("Two args constant");
		}
		
	
	public static void main(String[] args) { // following should be accesible but have to defined first
		// TODO Auto-generated method stub

		Rulesofconstructor R = new Rulesofconstructor();
		Rulesofconstructor R1 = new Rulesofconstructor(90);
		Rulesofconstructor R2 = new Rulesofconstructor("Priyanka");
		Rulesofconstructor R3 = new Rulesofconstructor(30,50);
	
	}

}
