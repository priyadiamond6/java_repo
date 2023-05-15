package PARAMETERIZATION;

public class SwitchStatement {

	public static void main(String[] args) {
	
//Syntax :
		
//		switch(Exoression) {
//		case value1:
//			//code to executed
//			break;
//		case value2:
//			//code to be executed
//			break:
//		case value 3:
//			//cod to be executed
//			break:
//		default:
//			//code to be executed if all the cases are not matched
//		}
		
	int Number = 10;
	
	switch(Number) {
	// case satement 
	
	case 10:
		System.out.println("Number matched 70");
		break;//optional
	case 30:
		System.out.println("Number matched 50");
		break;
	case 20:
		System.out.println("Numner matched 30");
	break;
	
	default :
		System.out.println("Not mathched");
	}

	}

}
