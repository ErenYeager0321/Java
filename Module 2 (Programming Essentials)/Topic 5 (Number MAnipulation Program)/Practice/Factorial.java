package Practice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Number");
		int n = scanner.nextInt();

		Fact f = new Fact();
		int r = f.fc(n);
		System.out.println("Factorial of "+n+" is "+r);

		scanner.close();
		}
}
	class Fact {
		public int fc(int n) {
			int res = 1;
			for (int i = 1; i<=n; i++) {
				res *= i;
			}
			return res;
		}
	}