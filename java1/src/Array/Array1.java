package Array;

import java.util.Arrays; // this is class.

public class Array1 {// single dimensional & homogenous

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // store  1 to 10 number 
		int a = 1;
		int b = 2;
		int c = 3;
		 //  :
	    int x = 10;
	    
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(x);
	    System.out.println();
	    // Array declaration
	    int arr[] = new int[10];// variable/data type referencevariable/ variablename = new varaible/data type
	    
	    // Array initialization
	    
	    arr[0] = 10;
	    arr[1] = 20;
	    arr[2] = 30;
	    arr[3] = 40;
	    arr[4] = 80;
	    arr[5] = 90;
	    arr[6] = 70;
	    arr[7] = 50;
	    arr[8] = 60;
	    arr[9] = 100;
	   
	    
	    // Array Usage 
	    
	 System.out.println(arr[3]);
	 System.out.println();
	 System.out.println(arr[7]);
	 System.out.println();
	 System.out.println(arr[9]);
	 System.out.println();
	 System.out.println(arr.length);
	 System.out.println();
	 
	 System.out.println("Array Length : "+arr.length);
	 System.out.println();
	 
   //Arrays.sort(null);
     Arrays.sort(arr);
	 System.out.println();
	  for (int i=0; i<arr.length; i++) 	 { 
		//System.out.println(i);
		 
		  System.out.println(arr[i]);
}
}
}