package ENCAPSULATION;

public class Encapsulation2 {

public static void main(String[] args) {

	Encapsulation1 E = new Encapsulation1();

	E.setName("Kartik");
	E.setAge(23);
	E.setEmpID(9044);
	E.setSalary(100000);

	System.out.println(E.getName());
	System.out.println(E.getAge());
	System.out.println(E.getEmpID());
	System.out.println(E.getSalary());

	}

}
