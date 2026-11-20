package T11_Practice;

import java.util.Scanner;

public class P5_CharFrequency1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Ask user for input string
		// TODO: Count character frequencies
		// TODO: Print the results
		String s = sc.nextLine();
		s = s.toLowerCase();
		char[] arr = s.toCharArray();

		boolean v[] = new boolean[arr.length];
		System.out.println("Character Frequencies: ");
		for (int i=0; i<arr.length; i++) {
			if (v[i] || arr[i] == ' ') {
			continue;
			}
		int count = 1;
		for (int j=i+1; j<arr.length; j++) {
			if (arr[i] == arr[j]) {
				count++;
				v[j] = true;
			}
		}
			System.out.println(arr[i] + ": " + count);
		}
		sc.close();	
	}
}
