package Collectionlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
	
		LinkedList LL = new LinkedList(); // Heterogenous data
		
		LinkedList<String> LL1 = new LinkedList<String>(); // Any homogenous type of data
		
		LL1.add("100");
		
		// 1. add method
		
		LL.add("Welcome"); // string
		LL.add(20.4);//double
		LL.add('D');// char
		LL.add(null);
		LL.add(null);
		LL.add(true);
	   
	  System.out.println(LL);
	  
	  // 2. size
	  System.out.println(LL.size());
	  
	 
	  // 3. Remove 
	  System.out.println(LL);
	  LL.remove(20.4);
	  System.out.println(20.4);
	  System.out.println(LL);
	  
	  // 4. insert new element
	  LL.add(3, "Java");
	  System.out.println(LL);
	  
	  // 5. get method
	  System.out.println(LL.get(4));
	  
	  // 6. first index element
	  System.out.println(LL.getFirst());
	  
	  //7. last index element
	  System.out.println(LL.getLast());
	  
	  
	  // 8. set method
	  System.out.println(LL.set(3, "ooty"));
	  System.out.println(LL);
	  
	  
	  // 9. isEmpty
	  System.out.println(LL.isEmpty());
	  System.out.println(LL1.isEmpty());
	  
	  // 10. contains method
	  System.out.println(LL.contains("Java"));
	  System.out.println(LL.contains("Python"));
	  
	  // 11. Reading element using for loop
	  System.out.println("Reading element using for loop");
	  for (int i=0; i<LL.size(); i++) {
		  System.out.println(LL.get(i));
	  }
	  System.out.println();
	  
	  // 11. Reading element using for each loop 
	  System.out.println("Reading element using for each loop ");
	  
	  for (Object obj : LL) {
		  System.out.println(obj);
	  }
	  
	  
	  // 12. Reading element using Iterators
	  System.out.println("Reading element using Iterators");
	  
	  Iterator it = LL.iterator();
	  
	  while (it.hasNext()) {
		  
      System.out.println(it.next());
	  }
		
	
	}

}
