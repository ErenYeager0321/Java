package T8_String_RegEx_Matching;

import java.util.Scanner;

public class P1_RegEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Ask user for input string
		// TODO: Check if the string starts with "Hello"
		// TODO: Check if the string ends with "World!"
		// TODO: Check if the string is empty
		// TODO: Check if the string contains only letters using regex
		String s = sc.nextLine();
		System.out.println("Does the string start with \"Hello\"? " + s.startsWith("Hello"));
		System.out.println("Does the string end with \"World!\"? " + s.endsWith("World!"));
		System.out.println("Is the string empty? " + s.isEmpty());
		System.out.println("Does the string contain only letters? " + s.matches("^[A-Za-z]+$"));
		sc.close();
		}
}
