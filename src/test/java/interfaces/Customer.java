package interfaces;

public class Customer {

	public static void main(String[] args) {

		Axis mybank = new Axis();
		mybank.interestfreeLoan(); // we can access interface & class Methods

		RBI mybank1 = new Axis();
		mybank1.aadharman(); // we can access only interface Methods
	
	}
}
