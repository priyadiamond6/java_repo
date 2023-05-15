package Collectionlist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		//int arr[] = new int[0]; // static plus homogenous or similar type data
		
		// Oject Array
		ArrayList AL = new ArrayList(); // homogenous & heterogenous data 
		
		ArrayList <String> AL1 = new ArrayList <String>(); // cant be used for heterogenous
		
		AL1.add("Priya"); // can pass only string in string array
		
		System.out.println(AL1);
	
		
		AL.add(100);
		AL.add("Welcome"); // string
		AL.add(20.4);//double
		AL.add('A');// char
		AL.add(true);
		AL.add(100);
		AL.add(null);
	    AL.add("singer");
	    AL.add(true);
	  
		
	    
		// 1. print array
	    AL.retainAll(AL1);
	    System.out.println(AL);
		System.out.println(AL);
		
		
		// 2. size
		System.out.println("Number of element in given arraylist:"+AL.size());
		
		AL.add(300);
		AL.add(300);
		AL.add(300);
		AL.add(300);
		System.out.println(AL.size());
		System.out.println(AL);
		
		// 3. Remove - syntax = AL.remove();
		
		System.out.println(AL);
		AL.remove(20.4);
		System.out.println(20.4);
		System.out.println(AL);
		
		// 4. Insert New Element
		
		AL.add('S');
		System.out.println(AL);
		
		AL.add(2,"Java");
		System.out.println(AL);
		
		// 5. Retrieve Specific Element
		
	    System.out.println(AL.get(1));
	   // System.out.println(AL.get(22)); // IndexOutOfBoundsException
	    //System.out.println(AL.get(6));
	    
	    // 6. Change/Replace element
	    
	    AL.set(3,"Priya");
	    System.out.println(AL);
	    
	    AL.set(4,"Aditya");
	    System.out.println(AL);
	    
	    //7. contains method
	    System.out.println(AL.contains("Aditya"));
	    System.out.println(AL.contains("Rahul"));
	    System.out.println();
	    // 8. isEmpty
	    
	    System.out.println(AL.isEmpty());
	    System.out.println(AL1.isEmpty());
	    System.out.println();
	    
	    // 9. Read/Print data from ArrayList
	    
	    System.out.println("Reading element using for loop");
	    System.out.println(AL.size());
	    System.out.println();
	    
	      //   i=0   0<12   - true
        //   i=1   1<12    - true
  
        //   i=12  12<12   - false  
	    
	    for (int i=0;i<AL.size();i++) {
	    	//System.out.println(AL.get(0));
	    	System.out.println(AL.get(i));
	    }
	    
	    System.out.println();
	    
	    System.out.println("Reading element using for each loop");
	    for (Object obj:AL) {
	    	System.out.println(obj);
	    }
	    
	    System.out.println();
	    System.out.println("Reading element using iterator");
	    
	    Iterator it = AL.iterator();
	    
	    while(it.hasNext()) {
	    	
	    	System.out.println(it.next());
	    }
	   
	  
	   }
	    	
	    
	}


