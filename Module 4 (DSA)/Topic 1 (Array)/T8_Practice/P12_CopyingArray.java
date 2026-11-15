package T8_Practice;

import java.util.Scanner;

public class P12_CopyingArray {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows And Col");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
			
		System.out.println("Give Input");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
// 		Instead Of All these for printing , we will use Enhanced "FOR" Loop
		System.out.println("Array1 :");
		for (int[] i : arr) {
			System.out.print("[ ");
		    for (int j : i) {
		        System.out.print(j + " ");
		    }
		    System.out.println(" ]");
		}
		
//		System.out.println("Original Array: ");
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int[][] arr2 = new int[m][n]; // for Copying second array length should be same
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {// Copying Arr1 to Arr2
				arr2[i][j]=arr[i][j];// Here Arr2[j][i] ulta Likha hai Kyuki Transpose Ho rha hai yaha 
			}
		}
		
		System.out.println("Copied Array2 :");
		for (int[] i : arr2) {
			System.out.print("[ ");
		    for (int j : i) {
		        System.out.print(j + " ");
		    }
		    System.out.println(" ]");
		}
		
//		System.out.println("Copied Array: ");
//		for(int i=0; i<arr2.length; i++) {
//			for(int j=0; j<arr2[i].length; j++) {
//				System.out.print(arr2[i][j]+" ");
//			}
//			System.out.println();
//		}
		sc.close();
	}
}

