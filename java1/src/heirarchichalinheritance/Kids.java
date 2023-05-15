package heirarchichalinheritance;

public class Kids extends Myntra { // Subclass

	public void toys () {
		System.out.println("barbie doll");
		System.out.println("teady bear");
		System.out.println("dog");
		System.out.println("rabbit");
	}
	
	public static void main(String[] args) {
		Kids K = new Kids();
		K.toys();
		K.shopping();
	}

}
