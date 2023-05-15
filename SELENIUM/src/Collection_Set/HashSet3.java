package Collection_Set;

import java.util.HashSet;

public class HashSet3 {
// retain subset & remove can see in console by commenting any two of them
	
	public static void main(String[] args) {
    
	HashSet HS = new HashSet();
	
	HS.add(2);
	HS.add(3);
	HS.add(5);
	HS.add(8);
	HS.add(33);
	
	System.out.println(HS);
	
	HashSet HS1 = new HashSet();
	
	 //add method
	HS1.add(3);
	HS1.add(44);
	HS1.add(10);
	HS1.add(33);
	
	System.out.println(HS1);
	
	// addAll method
	HS.addAll(HS1); // duplicate not allowed, only unique value is displayed
	System.out.println(HS);

   // retainAll method = retains only common elements
	HS.retainAll(HS1); 
	System.out.println(HS); // 3, 10, 44
	
	
	// subset method 
	System.out.println(HS.containsAll(HS1)); // false if commented HS1
	System.out.println(HS.containsAll(HS1)); // true 

	// removeall = comman elements are removed
	HS.removeAll(HS1);
	System.out.println(HS);
	
	}

}
