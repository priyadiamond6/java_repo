package CollectionQueue;

import java.util.Iterator;
import java.util.PriorityQueue;



public class PriorityQueue2 {

	public static void main(String[] args) {
	
	
	PriorityQueue PQ = new PriorityQueue();
	PriorityQueue PQ1 = new PriorityQueue();
	
	// 1. Add Method - Inserts specified element into priority queue
	
	PQ.add("C");
	PQ.add("E");
    PQ.add("H");
    PQ.add("O");
    
    System.out.println(PQ);
    
    // 2. Offer Method - Inserts specified element into priority queue
    //PQ.offer("Z");
//    PQ.offer("A"); 
//    PQ.offer("L");
//    PQ.offer("P");
//    PQ.offer("R");
    PQ.offer("X");
    PQ.offer("A");
    PQ.offer("A");
    PQ.offer("B");
    PQ.offer("Priya");
    
    System.out.println(PQ);
    // System.out.println(PQ.add(100)); // Class Cast Exception coz we cant add other types of element like 
                                        // int, charcter, boolean
    
    // 3. Element Method - Retrieves head but does not remove the head of the queue
    System.out.println(PQ.element());
    System.out.println(PQ);
    // System.out.println(PQ1.element()); // No Such Element Exception
    
    // 4. Peek Method - Retrieves but does not remove head of the queue or returns null if queue is empty
    System.out.println(PQ.peek());
    System.out.println(PQ1.peek()); // null
    
    // 5. Remove Method
    System.out.println(PQ.remove()); // removes the head element
    System.out.println(PQ);
    
   // System.out.println(PQ1.remove()); // No such element exception
    
    // 6. poll method - Retrieves & removes the head of the queue or returns null if queue is empty
     System.out.println(PQ.poll());
     System.out.println(PQ);
     System.out.println(PQ1.poll()); // null
     
     //  Read Element using Loops :-
     
     // 1. for loop
     
     for (int i=0; i<PQ.size(); i++) {
    	 System.out.println(PQ);
    	  }
     
     System.out.println();
     // 2. for each loop
     
     for (Object obj : PQ) {
    	 System.out.println(obj);
     }
     
     System.out.println();
     // 3. Iterator
     
   Iterator it = PQ.iterator(); 
   while (it.hasNext()) {
	   System.out.println(it.next());
   }

}
}