package FINAL_FINALLY_FINALIZE;

public class FINALIZE {

public static void main(String[] args) {

FINALIZE f = new FINALIZE();
f.demo();
f=null;
System.gc();

	}

public void demo() {
	System.out.println("demo method");
}

public void finalize() {
System.out.println("finalize method executed");
}
}