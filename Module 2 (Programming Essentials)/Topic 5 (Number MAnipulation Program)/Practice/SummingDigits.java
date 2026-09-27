package Practice;

import java.util.Scanner;

public class SummingDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter some digits");
		int number = scanner.nextInt();
		int sum = 0;
		while(number != 0) {
		int rem = number % 10;
		sum += rem;
		number = number / 10;
		}
		System.out.println("Sum of digits: "+sum);
		scanner.close();
		}
}
