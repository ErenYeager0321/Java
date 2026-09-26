package Continue_Statement;

import java.util.Scanner;

public class SumOfSquares {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int a = N;
		int result = 0;
		System.out.print("Sum of Squares: ");
		for(int i = 1; i<=a; i++) {
			if(i % 4 == 0)
				continue;
			System.out.println(result+" + "+i+" * "+i +" = "+(result += i*i));
//			result += i*i;
		}
		System.out.print(result+" ");
	}
}
