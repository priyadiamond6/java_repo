package LOOPS;

public class Forloop {

	public static void main(String[] args)  {
		
		for(int i=0 ;i<=10; i++) {
			System.out.println("Hello");       // Valid
		}
		System.out.println();
		
		for(int  i=0 ;i<=10;i++) {    // Valid
			System.out.println(i);
	}
		
		System.out.println();

		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}
//		for(int i=0 ;true ;i++) {        //valid - infinite loop
//			System.out.println("Hello");
//		}
		
		System.out.println();
//		
        for(int i=0 ;i<=5;i++)  {  //Valid
		System.out.println(i);
	}
	
//		for(String s="Pune" ;s<=10;s++) {      // invalid
//			System.out.println("Hello");
//             } 
			
//		for(;;) {
//			System.out.println("Hello");   // valid -infinite loop
//		}
		}
				

}


