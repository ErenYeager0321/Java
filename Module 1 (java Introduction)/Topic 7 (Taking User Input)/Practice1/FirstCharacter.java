package Practice1;

import java.util.Scanner;

public class FirstCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char result = FirstCharacter.First(input);
		System.out.println(result);
		
	}
	
	public static char First(String pehlachar) {
		char a = pehlachar.charAt(0);
		return a;
	}
	
}
