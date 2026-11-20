package T13_Practice;

import java.util.Scanner;
/*
 * Longest Palindromic Substring

Write a Java program to find the longest palindromic substring in a given string. Your program should:
1. Ask the user to input a string.
2. Find and print the longest palindromic substring.
3. If there are multiple substrings of the same maximum length, return any one of them.

Sample Input:
babad
Sample Output:
bab

1) Sample Input
cbbd

Sample Output
bb
 */
public class P4_LongestPalindromme {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		String longest = longestPalindrome(s);
		System.out.println(longest);
		}

		// Function to find longest palindromic substring
		public static String longestPalindrome(String s) {
		if (s == null || s.length() < 1) return "";

		int start = 0, end = 0;

		for (int i = 0; i < s.length(); i++) {
		int len1 = expandAroundCenter(s, i, i); // odd-length palindrome
		int len2 = expandAroundCenter(s, i, i + 1); // even-length palindrome
		int len = Math.max(len1, len2);

		if (len > end - start) {
		start = i - (len - 1) / 2;
		end = i + len / 2;
		}
		}

		return s.substring(start, end + 1);
		}

		// Expand from the center and return palindrome length
		private static int expandAroundCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
		left--;
		right++;
		}
		return right - left - 1;
		}
}
