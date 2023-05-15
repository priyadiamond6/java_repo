package Collection_Set;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
    
		HashSet<String> HS2 = new HashSet<String>();
		
		HS2.add("AA"); // Hashcode created in backend
		HS2.add("SS");
		HS2.add("TT");
		HS2.add("RR");
		System.out.println(HS2);
		
//		HS2.add("22");
//		HS2.add("233");
//		HS2.add("TT");
//		HS2.add("RR");
//		System.out.println(HS2);
		
//		HS2.add("Rahul");
//		HS2.add("Rohit");
//		HS2.add("TT");
//		HS2.add("RR");
//		System.out.println(HS2);
		
	HashSet<String> HS3 = new HashSet<String>();
	System.out.println(HS3);
	
	// add method
	HS3.addAll(HS2);
	System.out.println(HS3);
	
	// remove method 
	HS3.removeAll(HS2);
	System.out.println(HS3);
	

	
		
		
		
		
		

	}

}
