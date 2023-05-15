package package1;

public class Sample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main methd started");
        StudentInfo("Priyaanka", 32, 'A', 92.76f);
        StudentInfo("Rohini", 34, 'B', 64.34f);
        System.out.println("Main method ended");
	}
    public static void StudentInfo(String name, int RollNo, char grade, float percentage)
 {
	 System.out.println("..........StudentInfo..........");
	 System.out.println("Student name:" +name);
	 System.out.println("Student roll No:" +RollNo);
	 System.out.println("Student Grade:" +grade);
	 System.out.println("Student percentage:" +percentage);
 }
}
