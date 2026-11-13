package T1_Interface_Practice; 
 
public interface P3_BankService {
	 void deposit(double amount);
	 void withdraw(double amount);
	 void checkBalance();
	 void transfer(double amount, String toAccount);
}

class CitiBank implements P3_BankService {
	double balance;
	
	public void deposit(double amount) {
		balance += amount;
			System.out.println("CitiBank: Deposited $" + amount);
	}
	
	public void withdraw(double amount) {
		if (balance >= amount) {
		balance -= amount;
			System.out.println("CitiBank: Withdrawn $" + amount);
		} else {
			System.out.println("CitiBank: Insufficient funds");
		}
	}
	
	public void checkBalance() {
		System.out.println("CitiBank: Current balance is $" + balance);
	}
	
	public void transfer(double amount, String toAccount) {
		if (balance >= amount) {
		balance -= amount;
			System.out.println("CitiBank: Transferred $" + amount + " to " + toAccount);
		} else {
			System.out.println("CitiBank: Insufficient funds for transfer");
		}
	}
}

class ChaseBank implements P3_BankService {
	private double balance = 0;
		public void deposit(double amount) {
		balance += amount;
			System.out.println("ChaseBank: Deposited $" + amount);
	}
		
	public void withdraw(double amount) {
		if (balance >= amount) {
		balance -= amount;
			System.out.println("ChaseBank: Withdrawn $" + amount);
		} else {
			System.out.println("ChaseBank: Insufficient funds");
		}
	}
	
	public void checkBalance() {
		System.out.println("ChaseBank: Current balance is $" + balance);
	}
	
	public void transfer(double amount, String toAccount) {
		if (balance >= amount) {
		balance -= amount;
			System.out.println("ChaseBank: Transferred $" + amount + " to " + toAccount);
		} else {
			System.out.println("ChaseBank: Insufficient funds for transfer");
		}
	}
}

class Banking {
	public static void main(String[] args) {
//		P3_BankService citiBank = new CitiBank();
//		P3_BankService chaseBank = new ChaseBank();
		System.out.println("Something");
		testBankOperations(new CitiBank(), 500, 100, 100, "12345ABC");
		testBankOperations(new ChaseBank(), 500, 100, 100, "12345DEF");
	}
	public static void testBankOperations(P3_BankService bank, double deposit, double withdraw, double transfer, String transferTo) {
		bank.deposit(deposit);
		bank.withdraw(withdraw);
		bank.checkBalance();
		bank.transfer(transfer, transferTo);
	}
}