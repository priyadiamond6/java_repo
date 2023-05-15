    package package1;

    public class Sample9 {
 
	// method_return //method with parameter int, int )
	public static int addition(int a, int b) {
	int c=a+b;
	System.out.println(c);
	return c;
	
	}
	
	public static boolean demo7() {
	int a=10;
	int b=20;
	if (a<b) {
	return true;}
	else {
	return false;
	}
	}
	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		
		addition(20,40);
		int d = addition(10,20);
		System.out.println(d);
		System.out.println("Main method ended");
		
		if(demo7()==true) {
		System.out.println("return is working");
		}
		else {
		System.out.println("return is working in else");
		}

	    }

}
