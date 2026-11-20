package T13_Practice;

import java.util.Scanner;

/*
 * Triple String Transformation
Write a program that performs the following transformations on the
given three words:

1. For the first word, replace all vowels (a, e, i, o, u) with %.
2. For the second word, replace all consonants (non-vowel
alphabetic characters) with #.
3. For the third word, convert all letters to uppercase.
Finally, concatenate the three transformed words and print the
result.

Sample Input:
how
are
you
Sample Output:
h%wa#eYOU
 */
public class P3_TripleString {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Read three words from user
		// TODO: Replace vowels in the first word
		// TODO: Replace consonants in the second word
		// TODO: Convert the third word to uppercase
		// TODO: Concatenate the transformed words and print the result
		System.out.println("Enter 3 Strings");
		String s1 = sc.next().toLowerCase();
		String s2 = sc.next().toLowerCase();
		String s3 = sc.next().toUpperCase();
		char arr[] = s1.toCharArray();
		char arr1[] = s2.toCharArray();
		for (int i=0; i<arr.length;i++){
		if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
		arr[i] = '%';
		}
		}
		String s4 = new String(arr);
		for(int i=0; i<arr1.length; i++) {
		if (arr1[i] != 'a' && arr1[i] != 'e' && arr1[i] != 'i' && arr1[i] != 'o' && arr1[i] != 'u') {
		arr1[i] = '#';
		}
		}
		String s5 = new String(arr1);
		System.out.println(s3 + s4 + s2);
		sc.close();
		}
}
