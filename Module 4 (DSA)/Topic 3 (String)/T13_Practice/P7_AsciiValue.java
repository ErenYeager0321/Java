package T13_Practice;

import java.util.Scanner;

public class P7_AsciiValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Read a character from user input
		// TODO: Find the ASCII value of the character
		// TODO: Print the ASCII value
		char c = sc.next().charAt(0);
		int a = (int) c;
		System.out.println("The ASCII value of '" + c + "' is: " + a);
		sc.close();
		}
}
