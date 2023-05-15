package Collection_Set;

import java.util.LinkedHashSet;

public class LinkedHashSet3 {

	// same methods are used which are present in HashSet
	// Duplicate elements are not allowed
	// Insertion order is preserved
	// Default Cappacity = 16
	// Load Factor = 0.75
	public static void main(String[] args) {
    
	LinkedHashSet LHS3 = new LinkedHashSet();
	
	LHS3.add(200);
	LHS3.add(300);
	LHS3.add(400);
	LHS3.add(500);
	
	System.out.println(LHS3);

	System.out.println(LHS3.add(300)); // duplicate element allowed. it returns false
	
	System.out.println(LHS3.add(600)); // new element gets added. it returns true
    System.out.println(LHS3);
	}

}
