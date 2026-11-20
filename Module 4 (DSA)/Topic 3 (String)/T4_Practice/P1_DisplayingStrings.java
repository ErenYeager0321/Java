package T4_Practice;

import java.util.Scanner;

/*
Question- Creating and Displaying Strings in Java
Write a Java program that:
• Reads a line of text from the user, which will be used to create both strings.
• Creates two strings:
• The first string using double quotes, using the user input.
• The second string using the new keyword, using the same user input.
• Displays both strings to the console.
• Compares the references of the strings using the == operator and displays the result.
• Compares the contents of the strings using the equals() method and displays the result.
• Explains (via comments or printed output) how the strings are stored and how their references differ when using the new keyword.
*/
public class P1_DisplayingStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Step 1: Read input from user
		// Step 1: Read input from user
		System.out.print("Enter a line of text: ");
//		String userInput = sc.nextLine();
		String s1 = sc.nextLine(); // Its created inside Stringpool 
		String s2 = new String(s1); // Its created ouside Stringpool so thats why it has Different Reference
		
		// Step 2: Create strings
		// String str1 = userInput; // Created using literal (actually interned if typed directly)
		// String str2 = new String(userInput); // Created using new keyword (always a new object)
		
		// Step 3: Display both strings
		System.out.println("String created using double quotes: " + s1);
		System.out.println("String created using new keyword: " + s2);
		
		// Step 4: Compare references using '=='
		System.out.println("Are the two strings equal by '=='? " + (s1 == s2));
	
		// Step 5: Compare Content Of Strings Using equals()
		System.out.println("Are the two strings equal by 'equals()'?" + s1.equals(s2));
		sc.close();
	}
}
