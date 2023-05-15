package Array;

import java.util.Arrays;

public class Array3 {// single dimensional & homogenous

	public static void main(String[] args) {
		// TODO Auto-generated method stub

          // double array			
			double d []  = new double[4];// declaration
			
			// initialization
			d[0]  = 10.5d;
			d[1]  = 30;
			d[2]  = 50;
			d[3]  = 33;
			
			System.out.println(d[2]);
			System.out.println(d.length);
			          //   4<4 - false
			Arrays.sort(d);
			for(int i=0 ;i<d.length;i++) {
				
				System.out.println();
				
				//System.out.println(i);
				
				System.out.println(d[i]);
			}
			System.out.println();
			// Boolean  Array
			
			boolean b[]  =new boolean[4];
			
			b[0]  = true;
			b[1]  = false;
			b[2]  = false;
			b[3]  = true;
			
			System.out.println(b.length);
			System.out.println(b[0]);
			System.out.println(b[1]);
		    System.out.println();
		   
			for (int i=0; i<b.length; i++) {
				System.out.println(b[i]);
			}
			
		

	}

}
