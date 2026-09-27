package Practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("The first " +n+ " Fibonacci numbers are:");
		int fib1 = 0;
		int fib2 = 1;
		if (n == 1) {
			System.out.println(fib1);
			}
		else if (n == 2) {
			System.out.println(fib1+ " " +fib2);
		} 
		else {
			System.out.println(fib1);
			System.out.println(fib2);
		for(int i = 3; i <=n; i++) {
			int num = fib1+fib2;
			System.out.println(num);
			fib1 = fib2;
			fib2 = num;
			}
		}
	}
}
