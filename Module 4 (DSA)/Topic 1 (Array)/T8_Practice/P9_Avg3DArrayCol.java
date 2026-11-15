package T8_Practice;
import java.util.Scanner;
/*
Average of Each 3D Column in 3D Array
Write a Java program that creates a 3D array of integers and calculates the average of each
3D column (i.e., elements with the same x and y coordinates across all layers). Your program
should:
1. Ask the user for the dimensions of the 3D array (depth, rows, and columns).
2. Create a 3D array of integers with the given dimensions.
3. Populate the array with user-input values.
4. Calculate and print the average of each 3D column.
*/
public class P9_Avg3DArrayCol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int o = sc.nextInt();

		int[][][] arr = new int[m][n][o];

		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<o; k++) {
				arr[i][j][k] = sc.nextInt();
				}
			}
		}

		System.out.println("3D Array: ");
		for(int i=0; i<m; i++) {
			System.out.println("Layer "+(i+1)+": ");
			for(int j=0; j<n; j++) {
				for(int k=0; k<o; k++) {
					System.out.print(arr[i][j][k]+ " ");
				}
			System.out.println();
			}
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<o; j++) {
				double sum = 0;
				for(int k=0; k<m; k++) {
				sum += arr[k][i][j];
				}
			double avg = sum / m;
			System.out.println("Average of column ("+(i+1)+","+(j+1)+"): "+avg);
			}
		}
		sc.close();
	}
}
