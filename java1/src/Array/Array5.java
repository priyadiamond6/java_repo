package Array;

import java.util.Arrays;

public class Array5 {

public static void main(String[] args) {// single dimensional & heterogenous

		
		Object obj[]  = new Object[6]; // to overcome homogenous disadvantage
		                              //we use object array for heterogenous
		
		obj[0]  = 10;  //Integer
		obj[1]  = 10.5; //double
		obj[2]  = "Welcome";  // String
		obj[3]  = 'A';
		obj[4]  = true;//true;
		obj[5]  = null;//null;
		
		System.out.println(obj[4]);
		//Arrays.sort(obj); // class cast exception
		System.out.println();
		
	     for(int i=0 ;i<obj.length;i++) {
			
			System.out.println(obj[i]);
		}
		
	}

}


