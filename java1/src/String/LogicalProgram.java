package String;

public class LogicalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a Program (WAP) to reverse a stirng without using reverse function
		
		String S1 = "Good Morning ";
		//EXP OUT : gninroM dooG
		
		int leng = S1.length();
		System.out.println(leng);
		 
		System.out.println(); 
		
		String Reverse = "";
		
		// i=11  11>=0  -True
		// i=10 10>=0   -True
		//.
		//.
		//i=0 0>=0  -Ture...after this line condition becomes false
		for (int i=leng-1; i>=0; i--) {//leng-1 = 12-1 = 11,11th index is g (leng-1)
			
			//g = 0 + G
	        //gn = g + n	
			Reverse = Reverse + S1.charAt(i);
			System.out.println(Reverse);
		
		}
		System.out.println();
		
		System.out.println(Reverse);
		}
		
		
		
	}


