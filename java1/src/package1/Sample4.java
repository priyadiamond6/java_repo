package package1;

public class Sample4 {
// non static method call from different class 
	public static void main(String[] args) {
		Sample3 s3=new Sample3(); // create object of class
        s3.m3();//objectname.methoddname();
        s3.m4();

}
}