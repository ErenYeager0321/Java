package T4_Practice;

import java.util.Scanner;
/*
Immutable Username Update
In a user management system, usernames are stored and must remain constant to ensure
data integrity. However, sometimes there's a need to generate a new username by appending
a suffix for session tracking or versioning.
Write a Java program that:
• Reads an original username and a suffix to append.
• Demonstrates the immutability of strings by showing that the original username remains
unchanged after the modification attempt.
• Creates a new username by concatenating the original username with the suffix.
• Prints both the original and the new usernames.
*/
public class P2_ImmutableString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give Inputs Of These 2 Strings");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println("Original Username: " + s1);
		System.out.println("New Username: " + (s1+s2));// By Concatenating 2 Strings , Newer String will be created outside the StringPool
		sc.close();
	}
}
