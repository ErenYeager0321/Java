package PiggyBank;

class PiggyBank {
	private double money;

	public void addMoney(double amount) {
		if (amount > 0) {
			money += amount;
			System.out.println("Added Money "+ money);
		} else {
			System.out.println("Nice try! Can't add negative money.");
		}
	}

	public void withdrawMoney(double amount) {
		if (amount > 0 && amount <= money) {
			money -= amount;
			System.out.println("Withdrawed Amount "+ amount);
		} else {
			System.out.println("Sorry, not enough funds or invalid amount.");
		}
	}

	public void checkBalance() {
		System.out.println("Balance " + money );
		
	}
}