package Collectionlist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {
	
		String arr [] = {"Priyanka", "Jyotsana", "Smita"};
		
		// for each loop
		//System.out.println(arr);
       for (String a : arr) {
    	   System.out.println(a);
       }
	
       // converting array into arraylist
       ArrayList AL = new ArrayList(Arrays.asList(arr));
       System.out.println(AL);
	} 
}

