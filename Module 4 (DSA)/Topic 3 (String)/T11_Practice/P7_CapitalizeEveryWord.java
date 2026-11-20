package T11_Practice;

import java.util.Scanner;

public class P7_CapitalizeEveryWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().trim().split(" ");
		// Write your code here to process and capitalize each word
		for (int i=0; i<s.length; i++) {
			char arr[] = s[i].toCharArray();
			arr[0] = Character.toUpperCase(arr[0]);
			s[i] = new String(arr);
		}
			String result = String.join(" ", s);
			System.out.println(result);
			sc.close();
		}
}
