package while_Loop;

import java.util.Scanner;

public class EvenNo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number");
	int N = sc.nextInt();
	int i = 2;
//	int i = 1; To Print Odd No.
	while(i<=N) {
		System.out.println(i);
		i = i + 2;
//		i += 2; 
	}
	
	
	}
}
