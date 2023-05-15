package package1;

public class Sample18 
 {

		public static void main(String[] args) {

			//Non static method calling from diff class
			
			Sample18 s18 = new Sample18();
			s18.Nonstaticmethod1();
			s18.Nonstaticmethod2();
			
		}
		
		public void Nonstaticmethod1() {
			
			System.out.println("Good morning");
		}
		
		public void Nonstaticmethod2() {
			System.out.println("Good evening");
		}
//		public static void m3(){
//			System.out.println("Hi");
//		}

	}
