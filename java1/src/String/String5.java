package String;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String S1 = "Python"; //20
 
 String S2 = "Python"; // 20
		 
 String S3 = "Python"; // 20
 
 S3 = "Java";   // 29 // new object for java gets created
 
 
 S1 = "India"; // 31
 
 S2 = "World"; // 33
 
 S1 = "US";
 
 System.out.println(S3);
 
 System.out.println(S1);
 
 System.out.println(S2);
 
 System.out.println(S1);
 
 int a = 30;
 a = 40;
 
 System.out.println(a);
 // 1. once we create an object after that java doesn't allow to perform changes. 
 // but if u trying to perform any changes with those changes new object will be created.
	
 //	2. security - ex. Mobile pass for employess
 
 // 3. code optimization & performance - ex. amazon customers data // requires less memory
	
	}

}
