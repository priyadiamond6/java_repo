package accessmodifiers;

public class Default1 {// default modifier accessible within class and within package
int no = 70;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Default1 d1 = new Default1();
		d1.Netherlands();
		d1.Alaska();
		System.out.println(d1.no);
	}
   void Netherlands () { // default means no keyword used for method like public private or protected
	   System.out.println("Default method = Netherlands");
   }
   
   void Alaska () { 
	   System.out.println("Default method = Alaska");
   }
   }
