package T13_Practice;

import java.util.Scanner;

public class P9_PlaindromeSwapping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		char arr[] = s.toCharArray();
		int[] count = new int[256]; // ASCII size
		// Count frequency of each character
		for (int i = 0; i < arr.length; i++) {
		count[arr[i]]++;
		}
		// Count odd frequencies
		int oddCount = 0;
		for (int freq : count) {
		if (freq % 2 != 0) {
		oddCount++;
		}
		}
		// Check palindrome condition
		if (oddCount <= 1) {
		System.out.println("The string '" + s + "' can be rearranged to form a palindrome.");
		} else {
		System.out.println("The string '" + s + "' cannot be rearranged to form a palindrome.");
		}
		sc.close();
		}
}
