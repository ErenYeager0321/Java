package T5_StringOperations;

import java.util.Scanner;

public class T7_JointAndsplit {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "Learning Java is Fun";
		String split[] = s1.split(" ");// Jaha Space hoga Waha Waha Se Split Ho Jayegi String
		System.out.println("Split Words");
		System.out.print("[ ");
		for (String s : split) {
			System.out.println(s);
		}
		System.out.println(" ]");
		
		String s3 = s1.join("-", split);
		System.out.println(s3);
		sc.close();
	}
}
