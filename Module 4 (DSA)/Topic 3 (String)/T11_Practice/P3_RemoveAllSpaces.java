package T11_Practice;

import java.util.Scanner;

public class P3_RemoveAllSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String s1 = sc.nextLine();
		System.out.println("String "+s1);
		s1 = s1.replaceAll("\\s+", "");
		System.out.println("Removed Spaces "+s1);
		sc.close();
	}
}
