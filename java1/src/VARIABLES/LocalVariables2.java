package VARIABLES;

public class LocalVariables2 {

	public static void main(String[] args) {
		
		int Rollnumber =30;    // Local varibales
		String name = "Rohit";
		
		System.out.println(Rollnumber);
		System.out.println(name);
		
		LocalVariables2 LV2 =new LocalVariables2();
		LV2.m1();
	}

	
	public void m1() {
		
		int i=30;
		int j=40;
		int k=i+j;
		
		System.out.println(k);
		
		String name ="Virat";
		
		System.out.println(name);
		
	}
}


