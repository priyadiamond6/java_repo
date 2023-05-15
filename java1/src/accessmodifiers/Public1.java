package accessmodifiers;

public class Public1 { // public keyword (access modifier) accesible throughout the class
 
	public static void main(String[] args) {
		
		Public1 P1 = new Public1 ();
		P1.Tirupati();
		P1.Assam();
	
	}
	public void Tirupati() {
		System.out.println("Public method - Laddoo");
	}
	
	public void Assam() {
		System.out.println("Public method - Muga Silk");
	}
	
}
