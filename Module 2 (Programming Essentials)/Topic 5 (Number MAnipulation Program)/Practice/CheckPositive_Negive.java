package Practice;

import java.util.Scanner;

public class CheckPositive_Negive {
	public static void main(String[] args) {
		// Use Scanner to take user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Number");
		int number = scanner.nextInt();

		if(number > 0) {
			System.out.println(number+ " is a positive number.");
			}
		else if ( number < 0) {
			System.out.println(number+ " is a negative number.");
			} 
		else {
			System.out.println(number+ " is zero.");
		}
	}
}
