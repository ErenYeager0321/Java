package T10_AdvFomatting;

import java.util.Scanner;

public class P1_StringForm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Ask user for their name
		// TODO: Ask user for their age
		// TODO: Format and print the string using String.format()
		String s1 = "Hello, my name is %s, and I am %d years old.";
		String s = sc.nextLine();
		int a = sc.nextInt();
		System.out.println(String.format(s1, s, a));
		sc.close();
		}
}
