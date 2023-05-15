package Array;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {// single dimensional & homogenous
		// TODO Auto-generated method stub

			
			//String array
			
           String args1[] = new String[5];// variable/data type referencevariable/ variablename = new varaible/data type
			
           //String []args1 = new String[5];
			
            args1[0]  = "Rohit";
			args1[1]  = "Virat";
			args1[2]  = "6Dhonz123";
			args1[3]  = "Dhoni";
			args1[4]  = "#$%^&1245";
			
			Arrays.sort(args1);
			
			//System.out.println(args1);
			
	        for(int i=0 ;i<args1.length;i++) {
				
				System.out.println(args1[i]);
			}
		 }

	
	}


