package T11_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class P2_Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		// Convert Strings to lowercase in place
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
				
		
		// Convert to char arrays
		char[] arr1 = s1.toString().toCharArray();
		char[] arr2 = s2.toString().toCharArray();
		
		Arrays.sort(arr1);// demo
		Arrays.sort(arr2);// Suppose If u gave Input mode after sorting it will become demo too
		
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		sc.close();
	}
}
