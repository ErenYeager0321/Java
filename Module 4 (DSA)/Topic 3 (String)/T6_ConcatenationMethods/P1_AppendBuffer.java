package T6_ConcatenationMethods;

import java.util.Scanner;

/*
Append Strings using StringBuffer
Write a Java program that appends three strings using StringBuffer. Your program should:
* Ask the user to input three strings.
* Append the strings together using StringBuffer.
* Print the concatenated result.
*/
public class P1_AppendBuffer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give Input Of 3 Strings");
		String s = scanner.nextLine();
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		StringBuffer sbf = new StringBuffer(s);
		sbf.append(s1+s2);
		System.out.println(sbf);
		scanner.close();
	}
}
