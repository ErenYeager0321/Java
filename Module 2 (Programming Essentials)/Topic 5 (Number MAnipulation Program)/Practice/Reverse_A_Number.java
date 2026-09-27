package Practice;

import java.util.Scanner;

public class Reverse_A_Number {
	public static void main(String[] args) {
/*		while(n≠0){
			1. access last digit
			rem=n%10;
			2. add the last digit
			to one variable called
			rev
			rev=rev*10+rem
			3.remove last digit
			n=n/10;
			}
			return rev;  */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Some Numbers");
		int n = sc.nextInt();
		int rev = 0;
		while(n != 0) {
			int rem = n % 10 ;//accessng last dig
			rev = rev * 10 + rem ;//adding last digit to rev*10
			n = n / 10 ;//removing last digit
		}
			System.out.println("Reversed Number: " + rev);
		}
}
