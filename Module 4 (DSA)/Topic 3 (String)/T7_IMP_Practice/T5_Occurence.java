package T7_IMP_Practice;

import java.util.Scanner;
/*
Write a Java program that counts the occurrences of a specific character in a given string. Your program
should:
1. Ask the user to input a string and a character.
2. Count how many times the character appears in the string.
3. Print the original string, the character, and the count of occurrences.

Sample Inputs and Outputs
Sample Input:
Hello World
o
Sample Output:
Original String: Hello World
Character: o
Occurrences: 2
*/
public class T5_Occurence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO: Ask user for input string and character

		// TODO: Count occurrences of the character in the string

		// TODO: Print original string, character, and count
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		char[] arr1 = s.toCharArray();
		char[] arr2 = s1.toCharArray();
		System.out.println("Original String: " + s);
		System.out.println("Character: " + s1);
		int sum = 0;
		for (int i = 0; i <= arr1.length-1; i++) {
		if (arr1[i] == arr2[0]) {
		sum++;
		}
		}
		System.out.println("Occurrences: " + sum);
		sc.close();
		}
}
