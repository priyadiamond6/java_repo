package LogicalProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		// 2 3 5 7 11 13 17 19 23 29
		
		System.out.println("Enter Number");
		Scanner SC = new Scanner(System.in);
		int num = SC.nextInt();
		int i;
		
		for ( i=2; i<num; i++) {
if (num%i==0 ) break;
}
	if(num==i) {
		System.out.println("Prime Number");
	}
	else {
		System.out.println("Not Prime Number");
	}

}
}