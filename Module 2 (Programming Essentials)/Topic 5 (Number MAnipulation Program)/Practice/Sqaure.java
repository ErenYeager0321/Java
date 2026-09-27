package Practice;

import java.util.Scanner;

public class Sqaure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number");
		int n = sc.nextInt();
		int square = 1;
		for (int i = 0; i <=n; i++) {
			square = i*i;
			System.out.println("The square of "+i+" is: "+square);
		}
	}
}
