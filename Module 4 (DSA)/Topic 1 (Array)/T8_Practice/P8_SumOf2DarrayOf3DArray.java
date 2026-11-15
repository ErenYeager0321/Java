package T8_Practice;
import java.util.Scanner;
/*
Write a Java program that creates a 3D array of integers and calculates
the sum of each 2D layer. Your program should:
1. Ask the user for the dimensions of the 3D array (depth, rows, and
columns).
2. Create a 3D array of integers with the given dimensions.
3. Populate the array with user-input values.
4. Calculate and print the sum of each 2D layer.
*/
public class P8_SumOf2DarrayOf3DArray {
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
			System.out.println("Layer " + (i+1) + ": ");
			for(int j=0; j<n; j++) {
				for(int k=0; k<o; k++) {
					System.out.print(arr[i][j][k]+ " ");
				}
			System.out.println();
			}
		}

		int sum = 0;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<o; k++) {
					sum += arr[i][j][k];
				}
			}
		System.out.println("Sum of layer "+(i+1)+": " + sum);
		sum = 0;
		}
		sc.close();
		}
}
