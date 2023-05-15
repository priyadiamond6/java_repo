package package1;

public class sample1 {
 public static void demo2() 
 {	
	
	System.out.println("hi i am from demo2 from sample1");
 }
	// static method call from different class

	public static void main(String[] args) {
	    System.out.println("main method from sample1");
	    method.demo();//classname.methodname(); 
        demo1();
        demo2();
   
      
	}
   public static void demo1()
   { 
	   System.out.println("hi i am from demo1 from sample1");
   }
}
