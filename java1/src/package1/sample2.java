        package package1;

        public class sample2 {

	    public static void main(String[] args) {
		System.out.println("main method started");
        sample2 s2=new sample2(); //Object created class name name of object = new class name ();
		s2.m1(); // m1 method called objectname.methodname();
		s2.m2(); //m2 method called 
	    }
         // nonstatic method ==== access specifier return type methodname()
		public void m1() {
			System.out.println("running nonstatic method:m1");
			
		}
		public void m2() {
			System.out.println("running nonstatic method:m2");
		}
	    }


