package ENCAPSULATION;

public class Encapsulation1 {

	private String Name;
	private int Age;
	private int EmpID;
	private int Salary;
	
	
public static void main(String[] args) {
	

Encapsulation1 E = new Encapsulation1();

E.setName("water");
E.setAge(25);
E.setEmpID(767);
E.setSalary(70000);

System.out.println(E.getName());
System.out.println(E.getAge());
System.out.println(E.getEmpID());
System.out.println(E.getSalary());


}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public int getAge() {
	return Age;
}


public void setAge(int age) {
	Age = age;
}


public int getEmpID() {
	return EmpID;
}


public void setEmpID(int empID) {
	EmpID = empID;
}


public int getSalary() {
	return Salary;
}


public void setSalary(int salary) {
	Salary = salary;
}
}