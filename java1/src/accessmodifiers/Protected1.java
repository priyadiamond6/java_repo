package accessmodifiers;

public class Protected1 {

	protected int s = 700;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Protected1 P = new Protected1();
		P.Home();
		P.Garden();
		System.out.println(P.s);
	}
protected void Home() {
	System.out.println("Protected method = Secure");
	System.out.println("this.s");
}

protected void Garden() {
	System.out.println("Protected method = Free");
	System.out.println("this.s");
}
}
