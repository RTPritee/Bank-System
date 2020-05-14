
public class MainBank {
	public static void main(String[]args) {
		BankSystem ob; // abstract class dont have any object it can only have refarance variable
		ob = new Bank();
		ob = new ExBank();
		ob.deposit();
		ob.withdraw();
		ob.interest();
	}
}
