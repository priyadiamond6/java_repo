package LogicalProgram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
System.out.println("Enter Number");
Scanner SC = new Scanner(System.in);
int num = SC.nextInt();

if (num%4==0) {
	System.out.println("Leap Year");
}

else {
	System.out.println("Not Leap Year");
}

	}

}
