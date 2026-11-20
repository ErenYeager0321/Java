package T13_Practice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class P2_RegExValidator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regex = sc.nextLine();
		try {
			Pattern.compile(regex);
			System.out.println("The pattern '" + regex + "' is valid.");
		} catch (PatternSyntaxException e) {
			System.out.println("The pattern '" + regex + "' is not valid.");
		}
		sc.close();
		}
}
