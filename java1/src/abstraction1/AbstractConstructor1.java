package abstraction1;

public abstract class AbstractConstructor1 {
	public AbstractConstructor1() {
    this(200);
		System.out.println("Abstract class constructor1");
	}
	
	private AbstractConstructor1(int i) {
		
		System.out.println("Private Constructor1");
	}
	


	

}
