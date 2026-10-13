package BankAccount;

public class BankAccount {
	private double balance = 0;
	private String accountNumber;
	
	public void setAccountNumber(String number) {
		if (number != null && number.length() == 6) {
			accountNumber = number;
	} 
	else {
			System.out.println("Invalid account number.");
		}
	}
	
	public void deposit(double amount) {
	if (amount > 0) {
		balance += amount;
		System.out.println("Deposited: ₹" + amount);
	} 
	else {
			System.out.println("Deposit amount must be greater than 0.");
		}
	}
	
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: ₹" + amount);
		} 
		else {
			System.out.println("Cannot withdraw. Invalid amount or not enough balance.");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
}
