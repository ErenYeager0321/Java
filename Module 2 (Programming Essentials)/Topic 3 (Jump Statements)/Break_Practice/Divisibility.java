package Break_Practice;

import java.util.Scanner;

public class Divisibility {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for(int i = 1; i <= N; i++) {
		if (i % 5 == 0) {
		break;
		}
		System.out.print(i+" ");
		}

		scanner.close();
		}
}
