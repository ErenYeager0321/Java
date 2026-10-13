package PiggyBank;

public class PiggyBankApp {
	public static void main(String[] args) {
		PiggyBank p = new PiggyBank();
		p.addMoney(5000);
		p.withdrawMoney(1000);
		p.checkBalance();
	}
}
