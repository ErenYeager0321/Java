package T11_Practice;

import java.util.Scanner;

public class P1_CountVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String s = sc.nextLine();
		
		int count = 0;
		s = s.toLowerCase();
		
		for(int i=0;i<=s.length()-1;i++){
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			count++;
			}
			System.out.println("Number of vowels:"+count);
		
//	1st	char arr[] = s.toCharArray();
//		for (char c : arr) {
//			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
//			count++;
//		}
//		System.out.println("Number of vowels:"+count);
			sc.close();
	}
}
