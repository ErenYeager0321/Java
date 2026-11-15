package T4_Practice;

import java.util.Scanner;

public class P1_Marks {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		
		for (int i = 0; i <=arr.length-1; i++) {
			for (int j = 0; j <=arr.length-1; j++) {
				System.out.println("Enter Marks Of Students of Class "+i);
				arr[i][j] = sc.nextInt();
			}
			System.out.println(" ");
		}
		
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.print(" [ ");
			for (int j = 0; j <=arr.length-1; j++) {
				System.out.print(arr[i][j]);
				if(j!= arr.length-1) {
					System.out.print(",");
				}
			}
			System.out.println(" ]");
		}
	}
}
