package Practice;

import java.util.Scanner;

public class PrimeBtw {
	public static void main(String[] args) {
		// Use Scanner to take user input for the range
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Start Number");
		int s = scanner.nextInt();
		System.out.println("Enter End Number");
		int e = scanner.nextInt();

		PPN pc = new PPN();
			System.out.println("Prime numbers between " + s + " and " + e + " are: ");
			for(int n = s; n <= e; n++) {
				if(pc.isprime(n)){
					System.out.println(n + " ");
			}
		}
	}
}
	class PPN {
		public boolean isprime(int n) {
			if (n <= 1) {
				return false;
			}
			for (int i = 2; i <= n/2; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
	}
}