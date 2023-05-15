package LogicalProgram;

import java.util.Scanner;

public class FIBONICCASERIES_USERINPUT {

	public static void main(String[] args) {
	int a=-1, b=1, c;
	System.out.println("Enter a number");
	Scanner Sc = new Scanner(System.in);
	int num = Sc.nextInt();
	
	for (int i=0; i<=num; i++) {
		
		c=a+b;
	
	System.out.println(" "+c);
	a=b;
	b=c;
	}
	}

}
