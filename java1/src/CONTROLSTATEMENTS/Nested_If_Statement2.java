package CONTROLSTATEMENTS;

public class Nested_If_Statement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =20;
		int Weight =45;
		
		if(age>=18) {  /// 10>18 - false 20>=18 - true
			
			if(Weight>=50) {  //45>=50  - false
				
				System.out.println("you are eligible for blood donation ");				
			}
			else {
				System.out.println("you are not eligible for blood donation ");
			}
		}
		
		else {
		   System.out.println("Age must be greater than 18");
		}
	
	}

}
