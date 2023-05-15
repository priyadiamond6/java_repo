package LogicalProgram;

public class FIBONICCASERIES {

	public static void main(String[] args) {
	// In FC series, next number is the sum of two previous numbers
	// Example = 0 1 1 2 3 5 8 13 21 34 55 89
	
		int a=-1, b=1, c;
		
		for(int i=1; i<=10; i++) {
			
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}

	}

}
