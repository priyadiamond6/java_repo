package Collectionlist;

import java.util.Collections;
import java.util.LinkedList;



public class LinkedList2 {

	public static void main(String[] args) {
    
		LinkedList<String>LL = new LinkedList<String>();
		
		LL.add("D");
		LL.add("B");
		LL.add("A");
		LL.add("X");
		LL.add("Y");
		
		System.out.println(LL);
		
		LinkedList<String> LL1 = new LinkedList<String>();
		
		// 1. addAll methos
		LL1.addAll(LL);
		System.out.println(LL1);
		
		// 2. remove all
		LL1.removeAll(LL1);
		System.out.println(LL1);
		System.out.println(LL1.isEmpty());
		
		// 3. collections method
		System.out.println("Before sort : "+LL);
		Collections.sort(LL);
		System.out.println("After sort : "+LL);
		
		// 4. Reverse Order
		Collections.sort(LL,Collections.reverseOrder());
		System.out.println(LL);
		
		// 5.add first 
		LL.addFirst("Hello");
		System.out.println(LL);
		
		// 6.add last 
		LL.addLast("OOPS");
		System.out.println(LL);


}
}
