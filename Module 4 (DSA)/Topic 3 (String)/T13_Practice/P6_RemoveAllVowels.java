package T13_Practice;

import java.util.Scanner;

public class P6_RemoveAllVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Read input string from user
		// TODO: Remove all vowels from the string
		// TODO: Print the resulting string
		String s = sc.nextLine();
		char arr[] = s.toCharArray();
		int j=0;
		for (int i=0; i<arr.length; i++) {
			if (!isVowel(arr[i])) {// If character is vowel so J will not accept
			arr[j] = arr[i];
			j++;
			}
		}

		String s1 = new String(arr, 0, j);
		System.out.println(s1);
		sc.close();
		}

		static boolean isVowel(char c) {
		System.out.println("aeiouAEIOU".indexOf(c) != -1);
		return "aeiouAEIOU".indexOf(c) != -1;
		}
}
