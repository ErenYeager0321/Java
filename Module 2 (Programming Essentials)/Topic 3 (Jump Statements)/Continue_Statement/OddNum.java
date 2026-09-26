package Continue_Statement;

import java.util.Scanner;

public class OddNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int a = N;
		System.out.print("Odd Numbers: ");
		for(int i=1; i<=a; i++) {
			if(i % 2 == 0)
				continue;
			System.out.print(i+" ");
		}
	}
}
