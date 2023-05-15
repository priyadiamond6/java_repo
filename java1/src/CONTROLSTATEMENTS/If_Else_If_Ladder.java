
package CONTROLSTATEMENTS;

public class If_Else_If_Ladder {

	public static void main(String[] args) {

//		If (condition 1){
//
//			//statement 1
//			}
//			Else if(condition 2){
//			//statement 2
//			}
//			Else if(condition 3){
//			//statement 3
//			}
//			Else{
//			//ststement
//			}
		
		int marks =30;
		
		if(marks>=65) {    //65>=30  -false
             System.out.println("Distinction");
	    }
		else if(marks>=60) {   //60>=30  -false
			System.out.println("1st class");
		}
		else if(marks >=55) {    //55>=30  -false
			System.out.println("Higher second class");
		}
		else if(marks>=50) {      //50>=30  -false
			System.out.println("Second class");
		}
		else if(marks >=35) {          //35>=30  -false
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");	
	}
	}
	}


