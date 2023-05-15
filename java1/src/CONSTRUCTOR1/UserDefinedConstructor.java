package CONSTRUCTOR1;

public class UserDefinedConstructor {
	// Step 1 Variable Declaration
	
	int a;
	int b;
	 
	public UserDefinedConstructor () {
	// Step 2 Variable Initialization
	
	a=5;
	b=3;
	}
	
	// Step 3 Usage
	public void addition() {
		a=14;
		int sum =a+b;
		System.out.println(sum);
	}
		public void multi() {
			a=6;
			b=10;
			int multi =a*b;
			System.out.println(multi);
		}
		public void div() {
			int div =a/b;
			System.out.println(div);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    UserDefinedConstructor UDC1  = new UserDefinedConstructor();
     
    UDC1.addition();
    UDC1.multi();
    UDC1.div();
	}

}
