package T7_IMP_Practice;
import java.util.Scanner;

public class T2_Palindrome2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
		System.out.println("ORIGINAL STRING : "+str);

		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String str2= new String(sb);
		System.out.println("REVERSED STRING : "+str2);

		if(str.equals(str2)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		scan.close();
	}
}
