package T8_Practice;
/*
Sum of Minimum Elements from Each Row in 2D Array
Write a Java program that creates a 2D array of integers, finds the
minimum element in each row, and then calculates the sum of these
minimum elements. Your program should:
1. Ask the user for the number of rows and columns.
2. Create a 2D array of integers with the given dimensions.
3. Populate the array with user-input values.
4. Find the minimum element in each row.
5. Calculate and print the sum of the minimum elements.
*/
import java.util.Scanner;

public class P6_SumMin2DArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 2D Array Row And Coloumns");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		
		System.out.println("Array Elements");
		for (int i = 0; i <m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter Array Elements of Row "+(i+1));
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i <m; i++) {
			System.out.print("[ ");
			for (int j = 0; j <n; j++) {
				System.out.print(arr[i][j]);
				if(j!= arr.length) {
					System.out.print(",");
				}
			}
			System.out.println(" ]");
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i][0];
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j] < min ) {
					min = arr[i][j];
				}
			}
			System.out.println("Minimum Of Row "+(i+1)+":"+min );
			sum += min;
		}
		System.out.println("Sum of Min of Every Row :"+sum);
		sc.close();
	}
}
