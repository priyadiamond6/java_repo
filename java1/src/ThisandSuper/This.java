package ThisandSuper;

public class This { 
	int Rollno = 500;
	int number = 70; // non static global variables
    String a="Priyanka";
    float b=5.8f;
    boolean c=true;
    
	public void Demo() {
		int Rollno = 100;
		int number = 20; // local variables
	    String a ="Shrikant";
	  
		System.out.println(Rollno); //100
		System.out.println(this.Rollno); // System.out.println(Rollno);
		
		System.out.println(number);
		System.out.println(this.number); // 500
		// this keyword is used to access global variables from same class
		
		System.out.println(Rollno);
		System.out.println(this.Rollno);
	}
		public void Demo1() {
			  float b=8.9f;
			    boolean c=false;
		
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(b);
		System.out.println(this.b);
		
		System.out.println(c);
		System.out.println(this.c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    This T1 = new This();
 
    T1.Demo();
    
    This T2 = new This();
    
    T2.Demo1();
	}


}
