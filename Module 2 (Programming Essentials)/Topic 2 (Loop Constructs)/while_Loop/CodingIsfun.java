package while_Loop;

import java.util.Scanner;

public class CodingIsfun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A NUmber");
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) {
			System.out.println("Coding is Fun");
			i++;
		}
	}
}
