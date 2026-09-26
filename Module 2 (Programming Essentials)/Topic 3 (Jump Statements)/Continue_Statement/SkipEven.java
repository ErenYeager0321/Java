package Continue_Statement;

import java.util.Scanner;

public class SkipEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maxNumber = scanner.nextInt();
		int a = maxNumber;
		for(int i=1; i<=a; i++) {
		if(i % 2 == 0)
		continue;
		System.out.println(i);
		}
		}
}
