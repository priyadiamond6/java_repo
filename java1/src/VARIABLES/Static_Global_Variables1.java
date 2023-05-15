package VARIABLES;

public class Static_Global_Variables1 {
	
 static int number = 80;
 
	public static void main(String[] args) {
		
	//Static global variables call from same class
		
		
			System.out.println(number); // direct calling

			Static_Global_Variables1 SGV = new Static_Global_Variables1();
			
			SGV.m1();
			
			SGV.m2();
			
		}
		public void m1() {
			
			System.out.println(number);
			
			System.out.println(number);
		}
		public void m2() {
			
			System.out.println(number);
		}
	}