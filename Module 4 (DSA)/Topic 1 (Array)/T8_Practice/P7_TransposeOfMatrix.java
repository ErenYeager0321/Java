package T8_Practice;

import java.util.Scanner;

// transpose - it means replacing Row elem to Col and Col elements to row
public class P7_TransposeOfMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows And Col");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[][] arr2 = new int[m][n];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {// Copying Arr1 to Arr2
				arr2[j][i]=arr[i][j];// Here Arr2[j][i] ulta Likha hai Kyuki Transpose Ho rha hai yaha 
			}
		}
		
		System.out.println("Original Matrix: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Transpose of the Matrix: ");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
			System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
