package Array;

import java.util.Arrays;

public class Array6 {
public static void main(String[] args) {

		
		//Dec & initi
		
		//int arr [] =new int [4];
		//arr[0] =6; //??????????
		
		
		int arr1[]  = {10,30,50,22,55,99,3,35,65,26,23,5,66};// initialization and declarartion 
		                                                     //combined
		
		System.out.println(arr1.length);
		
		System.out.println();
		
		Arrays.sort(arr1);
		
	    for(int i=0 ;i<arr1.length;i++) {// error array index out of bound 
	                                     //comes when i<=arr.1.length
			
			System.out.print(arr1[i]+" ");
		}
		
	}

}


