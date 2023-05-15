package Collectionlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

public static void main(String[] args) {
	
	Vector<Integer> VC = new Vector<Integer>(); // Homogenous + Integer
	
	// 1. add method
	VC.add(3);
	VC.add(4);
	VC.add(5);
	VC.add(10);
	VC.add(12);
	VC.add(14);
	VC.add(44);
	VC.add(50);
	VC.add(100);
	
	System.out.println(VC);
	
	// 2. size method
	System.out.println(VC.size());
	
	//3. remove method
	System.out.println(VC.remove(6));
	System.out.println(VC);
	
	//4. get method
	System.out.println(VC.get(4));
	
	// 5. update method
	System.out.println(VC.set(5, 200));
	System.out.println(VC);
	
	// 6. Add element
	VC.add(6,500);
	System.out.println(VC);
	System.out.println();
	// 7. Read element by using for loop
	
	for (int i=0;i<VC.size();i++) {
		System.out.println(VC.get(i));
	}
	System.out.println();
	
	//8. read element by using for each loop
	for (Integer it : VC) {
		System.out.println(it);
	}
	System.out.println();
	
	// 9. read element by using Iterator
	
	 Iterator it = VC.iterator(); 
	 while (it.hasNext()) {
		 System.out.println(it.next());
		 
	 }
	 Collections.sort(VC);
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
