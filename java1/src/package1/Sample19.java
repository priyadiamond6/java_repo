package package1;

public class Sample19 {


		public static void main(String[] args) {
			
			    System.out.println("Main method started");
			
	              Sample18 obj = new Sample18();
	  
	              obj.Nonstaticmethod1();
	              obj.Nonstaticmethod2();
	              
	              System.out.println();
	              
	              Sample19 S19= new Sample19();
	              S19.m3();
	              S19.m4();
	              
	      		 System.out.println("Main method ended");

		}
		
		public void m3() {
			System.out.println("Same class :m3");
		}
		
		public void m4() {
			System.out.println("Same class :m4");
		}
}