package Do_While_Loop;

import java.util.Scanner;

public class Fcatorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a");
		int N = scanner.nextInt();
		
		System.out.println("Enter b");
		int M = scanner.nextInt();
		
		int f1 = 1;
		int fac1 = 1;
		do {
			System.out.println(fac1 + " = "+fac1 + " * "+f1 + " = " + (fac1 *= f1));
//		fac1 *= f1; 
		f1++;
		} while (f1 <= N);
		System.out.println("Factorial of " +N+ " is " + (fac1));
		
		
		int f2 = 1;
		int fac2 = 1;
		do {
		System.out.println(fac2 + " * "+f2 + " = " + (fac2 *= f2));
//		fac2 *= f2;
		f2++;
		} while (f2 <= M);
		System.out.println("Factorial of " +M+ " is " + (fac2));
		}
}
