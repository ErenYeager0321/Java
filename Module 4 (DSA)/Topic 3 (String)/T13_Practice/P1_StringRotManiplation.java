package T13_Practice;

import java.util.Scanner;
/*
Sample Input:
HelloWorld
3
left
Sample Output:
Rotated String: loWorldHel

Sample Input:
HelloWorld
2
right
Sample Output:
Rotated String: IdHelloWor
*/
public class P1_StringRotManiplation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Take inputs
		String str = sc.nextLine();
		int n = sc.nextInt();
		sc.nextLine(); // consume leftover newline
		String direction = sc.nextLine().toLowerCase();

		sc.close();

		int len = str.length();
		n = n % len; // handle cases where n > length

		String rotated = "";

		if (direction.equals("left")) {
			rotated = str.substring(n) + str.substring(0, n);
		} else if (direction.equals("right")) {
			rotated = str.substring(len - n) + str.substring(0, len - n);
		} else {
			System.out.println("Invalid direction! Use 'left' or 'right'.");
			return;
		}
		System.out.println("Rotated String: " + rotated);
		}
}
