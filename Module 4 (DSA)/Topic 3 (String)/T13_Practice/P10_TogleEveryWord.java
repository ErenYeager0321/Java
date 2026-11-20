package T13_Practice;

import java.util.Scanner;

/*
 * Toggle Each Word in String
Write a Java program that toggles the case of each character in a string such that:
• The first character of every word is converted to uppercase if it's lowercase, and to lowercase if it's uppercase.
• The rest of the characters of each word are also toggled (uppercase becomes lowercase and vice versa).
Your program should:
• Ask the user to input a string.
• Toggle the case for each word in the string.
• Print the toggled string.

Sample Input:
hello World
Sample Output:
HELLO WORLD
 */
public class P10_TogleEveryWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Ask user for input string
		// TODO: Toggle each word in the string
		// TODO: Print result
/* Easy
public class Main {
    public static void main(String[] args) {
        String s = "Hello World Java";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                result = result + Character.toLowerCase(ch);
            }
            else if (Character.isLowerCase(ch)) {
                result = result + Character.toUpperCase(ch);
            }
            else {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
*/
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
			arr[i] = (char)(arr[i]-32);
		} else if (arr[i] >= 'A' && arr[i] <= 'Z') {
			arr[i] = (char)(arr[i] + 32);
			}
		}
			String result = new String(arr);
			System.out.println(result);
			sc.close();
		}
}
