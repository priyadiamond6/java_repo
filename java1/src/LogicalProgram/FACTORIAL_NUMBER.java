package LogicalProgram;

public class FACTORIAL_NUMBER {

	public static void main(String[] args) {
	
		int number = 6;
		int factorial = 1;
		
		for( int i=1; i<=number; i++ ) {
			 factorial = factorial*i;
			 
			//1=1*1=1
			//1=1*2=2
			//1=2*3=6
			}
		System.out.println("Factorial of"+" " +number+" " +"is "+factorial);

	}

}
