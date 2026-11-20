package T13_Practice;

import java.util.Scanner;

public class P5_ReverseAll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// 1st	String s1 = sc.nextLine();
//		StringBuffer sb = new StringBuffer(s1);
//		System.out.println(sb.reverse());
		
		// TODO: Read the input string from user
		// TODO: Reverse the string without using a temporary variable
		// TODO: Print the reversed string
// 2nd Method
		String s = sc.nextLine();
		char arr[] = s.toCharArray();
		char arr1[] = new char[arr.length];
		int j = arr.length-1;
		for (int i=0; i<arr.length; i++) {
			arr1[j] = arr[i];
			j--;
		}
		String s1 = new String(arr1);
		System.out.println(s1);
		
// 3rd	StringBuffer sb = new StringBuffer(str);
//		String rev="";// Another way Reversing
//		for(int i=str.length()-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//		}
//		System.out.println("REVERSED STRING : "+rev);
		sc.close();
	}
	
}
