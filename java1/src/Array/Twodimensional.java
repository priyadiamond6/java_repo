package Array;

public class Twodimensional {
	public static void main(String[] args) {

	// String  s[] = new String[4];  //1D array

	String  S1 [][]  = new String[4][5] ; //2D array //[4] = Row, [5] = Column.
		
	System.out.println(S1.length);  // Total no Rows
		
	System.out.println(S1[0].length);  // Total no of columns
	//initialization
	//Row & Columns
	
	//First Row
	S1[0][0]  = "A1";
	S1[0][1]  = "A2";
	S1[0][2]  = "A3";
	S1[0][3]  = "A4";
	S1[0][4]  = "A5";
		
	System.out.println();
	System.out.println(S1[0][3]);
		
	//Second Row
		
	S1[1][0]  = "B1";
	S1[1][1]  = "B2";
	S1[1][2]  = "B3";
	S1[1][3]  = "B4";
	S1[1][4]  = "B5";
		
	//Third Row 
		
	S1[2][0] = "C1";
	S1[2][1] = "C2";
	S1[2][2] = "C3";
	S1[2][3] = "C4";		
	S1[2][4] = "C5";
		
	//4th Row
		
	S1[3][0]  = "D1";
	S1[3][1]  = "D2";
	S1[3][2]  = "D3";
	S1[3][3]  = "D4";
	S1[3][4]  = "D5";
		
 	System.out.println(S1[1][3]);
 	System.out.println(S1[3][2]);
 		
 	 //Print all the values of 2D array
     //   0<4   - True
    //   1<4   - True
 	for(int row=0; row<S1.length; row++) { // Row //Outer for loop
 
 			         
 	for(int col=0; col<S1[0].length;col++) { //Columns //Inner loop
        //   0<5  - True   // this is for column  
         //   1<5  - True
         //   5<5  - false                
 				                 
 	System.out.print(S1[row][col]+" ");
 	
	// S1[0][0] - A1
    // S1[0][1] - A2
    // S1[1][0] 
 					
 	}
	}
	}
}
