package multilevelinheritance;

public class Farm5 { //Test class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		Farm1 F1 = new Farm1();
//		F1.tractor();
//		
//		Farm2 F2 = new Farm2();
//		F2.irrigation();
//		
//		Farm3 F3 = new Farm3();
//		F3.Dairyanimals();
		
		Farm4 F4 = new Farm4();// we can call by using single reference varaible
		                        //with the help of extend keyword
		F4.labours();
		
		F4.tractor();
		
		F4.irrigation();
		
		F4.Dairyanimals();
		
	}

}
