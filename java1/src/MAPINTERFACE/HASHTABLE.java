package MAPINTERFACE;

import java.util.Hashtable;

public class HASHTABLE {

public static void main(String[] args) {

Hashtable <Integer, String> HT = new Hashtable <Integer, String> ();
Hashtable <Integer, String> HT1 = new Hashtable <Integer, String>();

// default size =11, load factor = 0.75

HT.put(33, "Sumit");
HT.put(29, "Amit");
HT.put(55, "Java");
HT.put(67, "Python");
HT.put(55, "Automation");
//HT.put(21, null);
//HT.put(null, "Area");

System.out.println(HT);

System.out.println();

System.out.println(HT.remove(29)); // remove method present only for object key 
System.out.println(HT);            //not object value
System.out.println();

System.out.println(HT.containsKey(63));
System.out.println(HT.contains(33));
System.out.println();

System.out.println(HT.isEmpty());
System.out.println(HT1.isEmpty());
System.out.println();

System.out.println(HT.keySet());
System.out.println();

System.out.println(HT.get(55));
System.out.println();

System.out.println(HT.values());
System.out.println();

System.out.println(HT.entrySet());
System.out.println();

for (Object obj : HT.keySet()) {
	System.out.println(obj + " " +HT.get(obj));
	
}
}

}
