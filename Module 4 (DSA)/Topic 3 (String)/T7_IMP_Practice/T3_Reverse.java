package T7_IMP_Practice;

import java.util.Scanner;

public class T3_Reverse {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str = scan.next();
		System.out.println("ORIGINAL STRING : "+str);
		
		StringBuffer sb = new StringBuffer(str);
		String rev="";// Another way Reversing
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
			System.out.println("REVERSED STRING : "+rev);
		if(str.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindro");
		}
		scan.close();
	}
}
