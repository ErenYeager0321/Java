package T4_Practice;

import java.util.Scanner;

public class P2_JAnames {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. Of Classes");
		String names[][] = new String[sc.nextInt()][];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter No. Of Students in Class "+i);
			names[i] = new String[sc.nextInt()];
		}
		sc.nextLine();
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.println("Enter Names Of Students Of Class "+i);
				names[i][j] = sc.nextLine();
			}
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j]);
				if(j!= names.length-1) {
				System.out.print(",");
				}
			}
			System.out.println(" ]");
		}
	}
}
