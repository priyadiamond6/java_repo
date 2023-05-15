package Array;

public class Twodimensional1 {//????????

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		                    //4*3
	int number [][] = {{2,3,4}, {5,5,3},{6,4,2},{3,5,7}};
	//String number [][] = {{"A2","A3","A4"},{"B5","B5","B3"},{"C6","C4","C2"},{"D3","D5","D7"}};//inner brackets are row and 
		
		
		// int num [][] = new int [4][3];                                                  // and values in each bracket are columns 
		//{2,3,4} // 0
	   //{5,5,3} // 1
	  //{6,4,2} // 2
	  //{3,5,7} // 3
		
		System.out.println(number.length);  // Row
		System.out.println();
		System.out.println(number[0].length);   // Column
		System.out.println();
		System.out.println(number[3][2]);  // Row// row = 0,1,2,3. so 3 is fourth bracket
		                                 // column = 0,1,2. so 2 is third no. of fourth bracket
		System.out.println();
		System.out.println(number[2][1]); //  
		System.out.println();
		for (int i=0; i<number.length; i++) {
			
			for (int j=0; j<number[0].length; j++) {
				
				System.out.println(number[i][j]+" ");
				
			}
		}
		
		
		
		
		
	}

}


