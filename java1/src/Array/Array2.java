package Array;

import java.util.Arrays;

public class Array2 {// single dimensional & homogenous
	
	public static void main(String[] args) {
    
		char ch[] = new char [5];
 
         ch[0] =  'A';
		 ch[1] =  '2';
		 ch[2] =  '4';
		 ch[3] =  '*';
		 ch[4] =  'p';
		 
		
		 
		 System.out.println(ch[4]);
		 
		 
		 System.out.println(ch.length);
		 
		Arrays.sort(ch);
		 for (int i =0; i<ch.length;i++) {
			 //System.out.println(i);
			 System.out.println(ch[i]);
		 }
	
}
}
