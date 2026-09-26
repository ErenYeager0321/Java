package Continue_Statement;

import java.util.Scanner;

public class Skipping {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int a = N;
		System.out.print("Numbers: ");
		for (int i = 1; i<=a;i++) {
			if(i % 3 == 0 && i % 5 == 0)
				continue;
			System.out.print(i+" ");
		}
	}
}
