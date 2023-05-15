package CONSTRUCTOR1;

public class WithParameter {

	String name;
	int Price;
	String Colour;
	String Pattern;
	String Fabric;
	
	public WithParameter (String name1, int price1, String Colour1, String Pattern1, String Fabric1) {
		 
		name = name1;
		Price =price1;
		Colour =Colour1;
		Pattern =Pattern1;
		Fabric =Fabric1;
	}
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
 WithParameter WP1 = new WithParameter("Priyanka",3000,"Blue","abstract","Satin" );
 WithParameter WP2 = new WithParameter("Jyotsana",4000,"Red","geometric","chifon" );
 WithParameter WP3 = new WithParameter("Smita",5000,"Pink","floral","silk" );
 
 System.out.println(WP1.name+" "+WP1.Price+" "+WP1.Colour+" "+WP1.Pattern+" "+WP1.Fabric);
 System.out.println(WP2.name+"  "+WP2.Price+" "+WP2.Colour+" "+WP2.Pattern+" "+WP2.Fabric);
 System.out.println(WP3.name+"  "+WP3.Price+" "+WP3.Colour+" "+WP3.Pattern+" "+WP3.Fabric);
	}

}
