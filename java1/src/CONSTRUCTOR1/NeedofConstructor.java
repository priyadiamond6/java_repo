package CONSTRUCTOR1;

public class NeedofConstructor {
	
	String name = "Pravin";
	int age = 29;
	
	public NeedofConstructor(String name,int age) {
		
		System.out.println("Default constructor");
		this.name =name;
		this.age =age;
		System.out.println(name +" "+age);
		
	}

	public static void main(String[] args) {
		
	    NeedofConstructor Student1 = new NeedofConstructor("Rohit",20);
		NeedofConstructor Student2 = new NeedofConstructor("Rahul",30);
		NeedofConstructor Student100 = new NeedofConstructor("Virat",40);
		
		
Student1.m1();
Student1.m2();	

Student2.m1();
Student2.m2();

Student100.m1();
Student100.m2();

	}
	
	public void m1() {
		 System.out.println(name+" "+age);
	}
	public void m2() {
		System.out.println(name+" "+age);
	}
/*Purpose of constructor:
 * 1. Once we create an object compulsory we required to perform initialization for that object
 * 2. The constructor is specially designed to perform initialization of object.
 * 3. Constructor is a special type of method
 * 4. Every time an object is created using new keyword at least one constructor is called
 */

}

  
