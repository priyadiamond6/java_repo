package heirarchichalinheritance;

public class Kitchen extends Myntra { //Subclass

	public void accesories() {
		System.out.println("plate");
		System.out.println("spoon");
		System.out.println("bowl");
		System.out.println("glass");
		System.out.println("jug");
	}

	public static void main(String[] args) {
		
		Kitchen KC = new Kitchen();
		KC.accesories();
		KC.shopping();
	}
}
