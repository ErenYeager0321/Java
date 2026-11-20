package T11_Practice;

import java.util.Scanner;

public class P4_CharFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 =  sc.nextLine();
		char arr[] = s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!='\u0000') {
			char currentchar = arr[i];
			int count = 1;
		
			for (int j = i+1; j <arr.length; j++) {
				if(arr[j]==currentchar) {
					count++;
					arr[j] = '\u0000';// it is use for Null Character
				}
			}
			System.out.println(currentchar+":"+count);
			}
		}
		sc.close();
	}
}
