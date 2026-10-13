package BankAccount;

public class BankAccountApp {
public static void main(String[] args) {
	BankAccount myAccount = new BankAccount();
	
	myAccount.setAccountNumber("123456");
	
	myAccount.deposit(1000);
	System.out.println("Initial balance: ₹ " + myAccount.getBalance());
	
	myAccount.deposit(500);
	System.out.println("After deposit: ₹ " + myAccount.getBalance());
	
	myAccount.withdraw(200);
	System.out.println("After withdrawal: ₹ " + myAccount.getBalance());
	
	myAccount.withdraw(2000); // This will not be allowed
	System.out.println("Final balance: ₹ " + myAccount.getBalance());
	System.out.println("Account number: " + myAccount.getAccountNumber());
	}
}
