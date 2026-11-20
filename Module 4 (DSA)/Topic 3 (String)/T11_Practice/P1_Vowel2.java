package T11_Practice;

import java.util.Scanner;

public class P1_Vowel2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = sc.nextLine();
		System.out.println("Original String: " + s1);
		char[] arr1 = s1.toCharArray();
		String s2 = "aeiouAEIOU";
		char[] arr2 = s2.toCharArray();
		int j = 0;
		int count = 0;
		for (int i=0; i<arr1.length-1; i++) {
		for (j = 0; j<arr2.length-1; j++) {
		if(arr1[i] == arr2[j]) {
		count++;
		}
		}
		}
		System.out.println("Number of vowels: " + count);
		sc.close();
		}
}
