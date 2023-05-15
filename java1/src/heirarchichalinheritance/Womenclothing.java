package heirarchichalinheritance;

public class Womenclothing extends Myntra {  // Subclass

	public void jeansbrand() {
		System.out.println("My favourite is Kraus");
		System.out.println("levis");
		System.out.println("only");
		System.out.println("leecooper");
	}
    public static void main (String args[])
{

	Womenclothing W = new Womenclothing();
	W.jeansbrand();
	W.shopping();

    
}
}
