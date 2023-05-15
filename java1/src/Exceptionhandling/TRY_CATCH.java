package Exceptionhandling;

public class TRY_CATCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Java");
		
		int Number  =50;
		
		try {
		System.out.println(50/0);  // THis code will throw Exception. Here we have handle the exception
		}
		catch (ArithmeticException e) { //
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Python");
		
		String name = null;
		try {
		System.out.println(name.length());
		} catch (NullPointerException P) {
			System.out.println(P.getMessage());
			P.printStackTrace();
			System.out.println("Hello1");
			
		}
		
		System.out.println("execution compeleted");
		
		int arr[] = new int[5];
		arr[6] = 90;
		try {
			System.out.println(name.length());
			} catch (ArrayIndexOutOfBoundsException P) {
				System.out.println(P.getMessage());
				P.printStackTrace();
				System.out.println("Hello2");
				}
		
		catch (ArithmeticException P) {
			System.out.println(P.getMessage());
			P.printStackTrace();
			System.out.println("Hello3");
			}
		
		catch (StringIndexOutOfBoundsException P) {
			System.out.println(P.getMessage());
			P.printStackTrace();
			System.out.println("Hello4");
			}
	
	
	}

}
