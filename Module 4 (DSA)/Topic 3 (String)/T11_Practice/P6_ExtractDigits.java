package T11_Practice;

import java.util.Scanner;

public class P6_ExtractDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s1 = "The year is 2024 and the temperature is 25 degrees.";
		String s1 = sc.nextLine();
		char arr[] = s1.toCharArray();
		System.out.println("Extracted Digits :");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == '0'|| arr[i] == '1'||arr[i] == '2'||arr[i] == '3'||arr[i] == '4'||arr[i] == '5'||arr[i] == '6'||arr[i] == '7'||arr[i] == '8'||arr[i] == '9') {
				System.out.print(arr[i]);
			}
		}
		sc.close();
	}
}
