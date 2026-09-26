package Do_While_Loop;

import java.util.Scanner;

public class Multiplying {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int Num = sc.nextInt();
		int i = 1;//Multiplier
		do {
			System.out.println(Num + " * " + i +" = " + (Num*i));
			i++;
		} while (i<=10);
		// Do Atleast RUN once before checking the condition
	}
}
