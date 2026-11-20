package T5_StringOperations;

import java.util.Scanner;

public class T3_indexOf {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// TODO: Ask user for input string
	// TODO: Ask user for a character to find
	// TODO: Print the index of the first occurrence
	String s = sc.nextLine();
	String s1 = sc.next();
	if (s.indexOf(s1) >= 0) {
	System.out.println("The index of the first occurrence is " + s.indexOf(s1) + ".");
	} else {
	System.out.println("Character not found.");
	}
	sc.close();
	}
}
