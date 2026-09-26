package while_Loop;

import java.util.Scanner;

public class Find_GCD {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers to find GCD");
		int m = scan.nextInt();
		int n = scan.nextInt();
		System.out.print("GCD OF "+m+" AND "+n+" IS ");
		while(n!=0) {
		int rem = m%n;
		m=n;
		n=rem;
		}
		System.out.println(m);
	}
}
