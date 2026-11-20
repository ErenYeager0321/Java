package T10_AdvFomatting;

import java.util.Scanner;

public class P2_FormDates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		double pi = sc.nextDouble();
		System.out.printf("Formatted integer: %d", number);
		System.out.println();
		System.out.printf("Formatted Pi: %.2f", pi);
		System.out.println();
		String date = "Tue, Sep 24 2024";
		System.out.println("date: " + date);

		sc.close();
		}
}
