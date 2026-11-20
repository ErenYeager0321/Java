package T5_StringOperations;

import java.util.Scanner;

public class T4_CharAt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Ask user for input string
		// TODO: Ask user for an index
		// TODO: Print the character at the specified index
		String s = sc.nextLine();
		int a = sc.nextInt();
		if ( a >= 0 && a <= s.length()-1 ) {
		System.out.println("The character at index " + a + " is " + s.charAt(a) + ".");
		} else {
		System.out.println("Invalid index.");
		}
		sc.close();
		}
}
