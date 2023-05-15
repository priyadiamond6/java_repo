package LogicalProgram;

import java.util.Scanner;

public class ARMSTRONG_NUMBER_userinput {

public static void main(String[] args) {

System.out.println("Enter Number");
Scanner SC = new Scanner(System.in);

int num = SC.nextInt();
int rem;
int sum;
int n = num;

// 153 = 1+125+27 = 153
for (sum=0; num>0; num=num/10) {

rem=num%10;
sum=rem*rem*rem+sum;
}
if(n==sum) {
	System.out.println("Armstrong Number");
}
else {
	System.out.println("Not Armstrong Number");
}

}
}