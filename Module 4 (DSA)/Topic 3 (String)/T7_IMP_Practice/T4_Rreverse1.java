package T7_IMP_Practice;

import java.util.Scanner;

public class T4_Rreverse1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String s1 = sc.nextLine();
		char arr[] = s1.toCharArray();
			System.out.print("[ ");
		for (char c : arr) {
			System.out.print(c);
		}
			System.out.println(" ]");
		
		char arr2[]=new char[arr.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr.length-1;i++) {
			arr2[j]=arr[i];
			j--;
		}
		String s2 = new String(arr2);
			System.out.println("REVERSED STRING : "+s2);
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		sc.close();
	}
}
