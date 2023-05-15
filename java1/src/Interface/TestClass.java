package Interface;

public class TestClass {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		// RBIBank RB = new RBIBank();
System.out.println(HSBCBank.minbalance);

HSBCBank  HB =new HSBCBank(); // compile time / static binding / early binding
				
HB.CreditCard();
HB.DebitCard();
HB.TransferMoney();
					
System.out.println();
HB.BikeLoan();
HB.PersonalLoan();
				
System.out.println();
HB.MutualFunds();
HB.CarLoan();
				
System.out.println();
HB.Homeloan();
HB.GoldLoan();
System.out.println();

RBIBank RB1 = new HSBCBank(); // dynamic binding / Upcasting / Topcasting
RB1.CreditCard();
RB1.DebitCard();
RB1.TransferMoney();
System.out.println();

USBank UB = new HSBCBank(); // dynamic binding / Upcasting / Topcasting
UB.BikeLoan();
UB.PersonalLoan();
System.out.println();

BrazilBank BB = new HSBCBank();// dynamic binding / Upcasting / Topcasting
BB.CarLoan();
BB.MutualFunds();



// downcasting hota nahi ka???????????// pudhe sangto//HSBCBank HB2 = (HSBCBank) new //USBank ();

//webDriver driver = new Chromedriver();

//driver.get("");// kite login ???????
			}
		
	}

