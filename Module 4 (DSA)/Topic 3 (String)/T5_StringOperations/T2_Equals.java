package T5_StringOperations;

import java.util.Scanner;

public class T2_Equals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Ask user for input password
		// TODO: Compare the input password with a predefined password
		// TODO: Print the comparison result
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		if (s.equals(s1)) {
		System.out.println("true");
		} else {
		System.out.println("false");
		}
		sc.close();
		}
}
