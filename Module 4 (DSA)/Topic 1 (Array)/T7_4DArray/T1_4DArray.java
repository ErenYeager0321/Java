package T7_4DArray;

import java.util.Scanner;

public class T1_4DArray {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int arr[][][][] = new int[2][3][2][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					for (int l = 0; l < arr[i][j][k].length; l++) {
						System.out.println("Enter Marks Of Student of University "+i+" College "+j+" Class "+k);
						 arr[i][j][k][l] = sc.nextInt();
					}
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("{ ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("[");
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print("(");
					for (int l = 0; l < arr[i][j][k].length; l++) {
						System.out.print(arr[i][j][k][l]);
						if(l!= arr[i][j][k].length) {
							System.out.print(",");
						}
					}
					System.out.print(")");
				}
				System.out.print("] ");
			}
			System.out.println(" }");

		}
	}
}
