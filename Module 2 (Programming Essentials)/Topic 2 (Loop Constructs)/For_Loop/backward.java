package For_Loop;

import java.util.Scanner;

public class backward {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter");
		int n = sc.nextInt();
		int sum = 0;
		for (int i=n;i>=1;i--) {
			sum = sum +i;
			System.out.println(i);
		}
		System.out.println(sum);
	}
}
