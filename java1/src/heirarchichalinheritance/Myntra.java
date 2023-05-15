package heirarchichalinheritance;

public class Myntra { // Superclass

	public void shopping () {
		System.out.println("online");
		System.out.println("payment access");
		System.out.println("return facility");
		System.out.println("refund");
	}
 public static void main(String[] args) {
	 Myntra M = new Myntra();
	 M.shopping();
}
}
