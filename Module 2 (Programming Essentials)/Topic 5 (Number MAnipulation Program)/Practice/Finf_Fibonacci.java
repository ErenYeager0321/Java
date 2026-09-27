package Practice;

import java.util.Scanner;

public class Finf_Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Number");
		int n = scanner.nextInt();
		int num = 0;
		int fib1 = 0;
		int fib2 = 1;
		if(n == 0) {
		System.out.println("The 0th Fibonacci number is "+fib1);
		} else if(n==1) {
		System.out.println("The 1th Fibonacci number is "+fib2);
		} else {
		for(int i = 2; i<=n; i++) {
		num = fib1+fib2;
		fib1 = fib2;
		fib2 = num;
		}
		System.out.println("The "+n+"th Fibonacci number is "+num);
		}
		scanner.close();
		}
}
