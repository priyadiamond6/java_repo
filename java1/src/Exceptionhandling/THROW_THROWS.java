package Exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class THROW_THROWS {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
	
String path = "C:\\Users\\dell\\Desktop\\STUDENTS.xlsx";
FileInputStream File = new FileInputStream(path);

Thread.sleep(3000);
System.out.println("Hello");
THROW_THROWS.priya(90);
}
	
	public static void priya (int marks) {
		if (marks<35) {
			System.out.println("Hi");
			throw new ArithmeticException("fail");
			
		}
		else {
			
			throw new ArithmeticException("pass");
			//System.out.println("result passed");
		}
		
	}
	}


