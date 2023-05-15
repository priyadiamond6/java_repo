package LOOPS;

public class Forloop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP addition of first 5 number
		
				//1+2+3+4+5 -- 15
				
				int sum = 0;
				            // 1<=5 - True
				            // 2<=5 - true
				            // 5<=5 - true
				            //6<=5  -false
				for(int i=1; i<=5; i++) {
					
//					0   = 0 + 1  = 1
//					1   = 1+  2  = 3
				  //3  = 3+3 =6
				  //	6 = 6+4=10		
//					10  =10+5    = 15
//					15
					sum =sum +i;
					System.out.println("Addition of first five number is :"+sum);

				}
				
				System.out.println();
				
				System.out.println("Addition of first five number is :"+sum);
			}

		
	}

