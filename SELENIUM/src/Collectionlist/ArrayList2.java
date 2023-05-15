package Collectionlist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
    
		ArrayList AL = new ArrayList ();
        
		AL.add("Deer");
		AL.add("Birthday");
		AL.add("Annivarsary");
		AL.add("Xerox");
		
		System.out.println(AL);
		
		
		ArrayList Duplicate = new ArrayList();
		
		// 1. Addall
		Duplicate.addAll(AL);
		System.out.println(Duplicate);
		
		// 2.REmove all
		Duplicate.removeAll(AL);
		System.out.println(Duplicate);
		System.out.println(Duplicate.isEmpty());
		
		// 3.Collections method
		System.out.println(AL);
		Collections.sort(AL);
		System.out.println(AL);
		
		// 4.REverse order
		Collections.sort(AL,Collections.reverseOrder());
		System.out.println(AL);
		
		// 5. shuffle order
		Collections.shuffle(AL);
		System.out.println(AL);
		
		
		
}
}