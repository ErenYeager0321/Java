package T13_Practice;

import java.util.Scanner;

public class P8_StringPermutation {
	public static void generatePermutations(String str, String ans) {
		// Base case: if string is empty, print the accumulated answer
		if (str.length() == 0) {
		System.out.println(ans);
		return;
		}

		// Try placing each character at the current position
		for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i); // pick a character
		// remaining string after removing ch
		String rest = str.substring(0, i) + str.substring(i + 1);
		generatePermutations(rest, ans + ch);
		}
		}

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read input string
		String s = sc.nextLine();

		System.out.println();
		generatePermutations(s, "");

		sc.close();
		}
}
