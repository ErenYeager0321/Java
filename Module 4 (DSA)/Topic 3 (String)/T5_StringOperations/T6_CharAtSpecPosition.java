package T5_StringOperations;

import java.util.Scanner;

public class T6_CharAtSpecPosition {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// TODO: Ask user for input string and position
	// TODO: Find and print the character at the given position
	String s = sc.nextLine();
	int a1 = sc.nextInt();
	int a = a1 - 1;
	if ( a >= 0 && a <= s.length() ) {
	System.out.println("Character at position " + a1 + ": " + s.charAt(a));
	} else {
	System.out.println("Invalid index.");
	}
	sc.close();
	}
}
