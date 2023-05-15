package Abstraction;

public class HSBCBank extends RBIBank {

	@Override
	public void creditcard() {
		System.out.println("HSBC-creditcard");
	}
	@Override
	public void debitcard() {
		System.out.println("HSBC-debitcard");
	}
	
		public void funds() {
			System.out.println("HSBC-funds");
		}
	}


