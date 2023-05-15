   package constructor;
   //example of user defined constructor
   public class CS2 {
   String city;
   String name;
   public CS2() 
   {
	 city="Pune";
     name="Velocity";
   }
	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
     display1();

     CS2 c2=new CS2();
     c2.display();
	}
	public void display()
	{
	System.out.println("I am non static display method");
	System.out.println("My city name is" +city);
	System.out.println("My name is" +name);
	}
	public static void display1()
	{
		System.out.println("I am static method display");
	}

}
