package T5_StringOperations;

import java.util.Scanner;

public class T5_SubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Ask user for input string
		// TODO: Ask user for two indices
		// TODO: Print the substring between the two indices
		String s = sc.nextLine();
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		if ( a1 >= 0 && a2 >= 0 && a1 < s.length() && a2 < s.length() ) {
		System.out.println("The substring is " + s.substring(a1, a2) + ".");
		} else {
		System.out.println("Invalid indices.");
		}
		sc.close();
		}
}
