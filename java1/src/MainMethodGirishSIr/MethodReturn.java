package MainMethodGirishSIr;

public class MethodReturn {

		// eg1- method with parameter - int,int
					public static int addition(int a, int b) {
						int c = a + b;
						//System.out.println(c);
						return c;
						
					}
					
					public static boolean demo7() {
						int a=10;
						int b=20;
						if (a<b) {
							return true;}
						
						else {
							return false;
						}
				}
			public static void main(String[] args) {
				System.out.println("main method started");

				 System.out.println(addition(20, 40)); //  return c = 60 in console
				
				int d = addition(10,20); // addition 10,20 is c
				
				System.out.println(d); // 30, 30 due to return in console

				System.out.println("main method ended");
				
				if (demo7()==true) {
					System.out.println("return is working");
				}
				else {
					System.out.println("return is working in else");
				}
	}

}
