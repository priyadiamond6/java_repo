package package1;

public class Sample21  {

	public static void main(String[] args) {

		// Static regular method with parameters
		
		Sample21.addition(20,30);
		Sample21.addition(40,140);
		Sample21.addition(11, 10);
		
		Sample21.Substraction(20, 4);
		
		Sample21.adddition1(22, 11, 22);
		
	}
	
	   public static void addition(int a,int b) {   // Two input para method
		
		int c=a+b; // c = 20+30;
		System.out.println("Addition of two numbers is : "+c);

         }
	
         public static void Substraction(int x,int y) {   // Two input para method
		
		int Sub=x-y; // c = 20+30;
		System.out.println("Addition of two numbers is : "+Sub);
		
         }
         
         public static void adddition1(int i,int j,int k) {
        	 
        	 int Sum =i+j-k;
        	 System.out.println(Sum);
        	 
         }
	
	
	
}
