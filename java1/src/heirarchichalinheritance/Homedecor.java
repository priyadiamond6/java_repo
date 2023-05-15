package heirarchichalinheritance;

public class Homedecor extends Myntra { // Subclass

	public void halldecoration() {
		System.out.println("flowervase");
		System.out.println("curtains");
        System.out.println("horse painting");		 
	}

	public static void main (String[] args) {
		
		Homedecor H = new Homedecor();
		H.halldecoration();
		H.shopping();
	}
	}

