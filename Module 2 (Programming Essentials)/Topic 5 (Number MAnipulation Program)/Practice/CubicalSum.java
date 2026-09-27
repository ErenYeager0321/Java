package Practice;

import java.util.Scanner;

public class CubicalSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int n = sc.nextInt();
		int sum = 1;
		for(int i = 1; i<=n;i++) {
		sum = i*i*i;
		System.out.println("The cube of "+i+" is: "+sum);
		}
	}
}
