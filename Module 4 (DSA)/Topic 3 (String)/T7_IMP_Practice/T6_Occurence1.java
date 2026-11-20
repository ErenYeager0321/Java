package T7_IMP_Practice;

import java.util.Scanner;

public class T6_Occurence1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char check = 'a'; 
		System.out.println("Enter a String");
		String s1 = sc.nextLine();
		char arr[] = s1.toCharArray();
		System.out.print("[ ");
		for (char c : arr) {
			System.out.print(c);
		}
		System.out.println(" ]");
		
		int occurence = 0;
		for (int i = 0; i < arr.length; i++) {
			if(s1.charAt(i) == check) { // it will check how many times a came
				occurence++;
			}
		}
		System.out.println(occurence);
		sc.close();        
	}
}
