package Practice;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
		// Use Scanner to take user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Number");
		int number = scanner.nextInt();
		PrimeChecker pc = new PrimeChecker();
		boolean res = pc.isprime(number);
		if(res == true) {
		System.out.println(number+ " is a prime number.");
		}
		else
		System.out.println(number+ " is not a prime number.");
		}
}
	class PrimeChecker {
		public boolean isprime(int n) {
			if (n <= 1) {
				return false;
		}
			for(int i=2; i <= n/2; i++) {
				if(n % i == 0) {	
					return false;
			}
		}
		return true; 
	}
}