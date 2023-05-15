package CONSTRUCTOR1;
//
public class WithoutParameterConstructor {// Step 1 Variable Declaration 
	int num;
	int num1;
	String name;
	
public WithoutParameterConstructor() { // Step 2 Variable Initialization
	num =40;
	num1 =60;
	int add =num+num1;
	System.out.println(add);	
	}
public WithoutParameterConstructor(int x, int y) {
	num =x;
	num1 =y;
	 int Addition = num+num1;
	 System.out.println(Addition);
}
public WithoutParameterConstructor(String Sname ) {
	name = Sname;
	System.out.println(name);
}
public void addition() {
	int sum = num+num1;
	System.out.println(sum);
}
public static void main(String[] args) {// following should be accesible but it should be defined
		// TODO Auto-generated method stub
		
   WithoutParameterConstructor W1 = new WithoutParameterConstructor();
   
   W1.addition();
    
   WithoutParameterConstructor W2 = new WithoutParameterConstructor(500,700);
    
   WithoutParameterConstructor W3 = new WithoutParameterConstructor("Priyanka");
   


}
	
}
