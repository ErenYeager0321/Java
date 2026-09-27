package Practice;

import java.util.Scanner;

public class NthTerm {
	public static void main(String[] args) {
		// Use Scanner to take user input
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		NSeries ns = new NSeries();
		int res = ns.nterm(n);
		System.out.println("The "+n+"th"+ " term of the series is "+res+".");
		}
}
	class NSeries{
		public int nterm(int n) {
			int sum = 0;
			for (int i = 1; i<=n; i++) {
				sum += i;
			}
			return sum;
		}
}