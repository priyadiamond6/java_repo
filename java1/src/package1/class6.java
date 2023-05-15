package package1;

public class class6 {

	public static void main(String[] args) {
		 // Arithmetic Operators

	int x = 23;
	int y = 16;
	System.out.println(x);
	System.out.println(y);
	
	int a= x+y;
	int b= x-y;
	int c= x*y;
	int d= x/y;
	int e= x%y;
	
	
	// The Answer of Operation 2 ( x value ) is always used in the second line.
	
	int f= x++; // Operation 1 f = x, f = 23 (answer)  // Operation 2 x=x+1, x=23+1, x=24 
	          
	int g= ++x; // Operation 1 x = x+1, x=24+1, x=25,// Operation 2 g = x, g = 25 (answer)
	
	int h= x--; // Operation 1 h = x, h = 25 (answer), // Operation 2 x = x-1, x = 25 - 1, x = 24
	
	int i= --x; // Operation 1 x = x-1, x=24-1, x = 23, // Operation 2 i = x, i = 23 (answer)
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	System.out.println(i);
			}

}
