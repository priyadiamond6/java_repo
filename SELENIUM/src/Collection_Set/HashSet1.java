package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
    
		// Set method, Get method & For Loop not applicable for HashSet 
	
	HashSet HS = new HashSet();
	
	HashSet HS1 = new HashSet(200, (float) 0.90);
	
	HashSet<String> HS2 = new HashSet<String>();
	
	HS.add(100);
	HS.add("Java");
	HS.add(12.5);
	HS.add('D');
	HS.add(true);
	HS.add(100);
	HS.add(null);
	HS.add(null); // Duplicate value not allowed so only one null in console
	
	System.out.println(HS);
	
	System.out.println(HS.add("Java"));  // if u r trying to add duplicate element then it will return false
	
	System.out.println(HS.add("Java1")); // if element is not present in the HashSet then it will return true
	                                     
	
	System.out.println(HS);
	
    // remove method

	HS.remove(2);    // element cant be removed by indexing
	System.out.println(HS);
	
	HS.remove('D'); // element can be removed by its name
	System.out.println(HS);
	
	// contains method
	System.out.println(HS.contains("Java")); // true
	System.out.println(HS.contains("Python")); // false
	
	// isEmpty method
	System.out.println(HS.isEmpty()); // false
	System.out.println(HS1.isEmpty()); // true
	
	// Read elements by for loop // not applicable
	
	for (int i=0;i<HS.size(); i++) {
		System.out.println(HS.getClass()); // console is  class = java.util.HashSet for all elements
	}
	 
	System.out.println();
	// Read elements by for each loop
	
	for (Object obj : HS) {
		System.out.println(obj);
	
		}
	
	System.out.println();
	
	// read elements by using Iterator
	
	Iterator it = HS.iterator(); 
	while (it.hasNext()) {
	System.out.println(it.next());
	}
	
	

	}

}
