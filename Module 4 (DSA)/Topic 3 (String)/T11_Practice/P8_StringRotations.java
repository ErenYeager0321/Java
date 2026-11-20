package T11_Practice;

import java.util.Scanner;

public class P8_StringRotations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Ask user for input strings
		// TODO: Check if the second string is a rotation of the first
		// TODO: Print result
		System.out.println("Enter 2 Strings");
		String s1 = sc.nextLine();// Suppose input HelloWorld
		String s2 = sc.nextLine();// WorldHello
		String s3 = s1 + s2;

		if (s3.contains(s2)) {
		System.out.println("The string '" + s2 + "' is a rotation of '" + s1 + "'.");
		}
		sc.close();
		}
}
