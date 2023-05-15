package VARIABLES;

public class Static_Global_Variables2 {


		static String name="Rahul";
		static int age = 25;
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		   Static_Global_Variables2.m1(); // static global variables call by class name
		   
		   Static_Global_Variables2 SGV = new Static_Global_Variables2(); // static global variables call by object creation

		   SGV.m2();

			}
		public static void m1() {
			System.out.println(name);
			System.out.println(age);
			
		}
		public void m2() {
			System.out.println(name);
			System.out.println(age);
		}

		
	}


