package T7_IMP_Practice;

import java.util.Scanner;

/*
Check if a String is Palindrome
Write a Java program that checks if a given string is a palindrome (reads the same forwards and
backwards). Your program should:
1. Ask the user to input a string.
2. Check if it is a palindrome.
3. Print whether or not it is a palindrome.
Sample Inputs and Outputs
Sample Input:
racecar
Sample Output:
The string 'racecar' is a palindrome.
*/
public class T1_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Ask user for input string
		// TODO: Check if it is a palindrome
		// TODO: Print result
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		String s1 = new String(sb.reverse());
		if (s.equals(s1)) {
			System.out.println("The string '" + s + "' is a palindrome.");
		} else {
			System.out.println("The string '" + s + "' is not a palindrome.");
		}
		sc.close();
		}
}
