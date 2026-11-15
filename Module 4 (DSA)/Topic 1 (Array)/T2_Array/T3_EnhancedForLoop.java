package T2_Array;

import java.util.Scanner;

public class T3_EnhancedForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array "+i);
			arr[i] = sc.nextInt();
		}
		//Enhanced FOR Loop For Output
		System.out.print("[ ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("]");
		
/*		System.out.println("Array1 :"); For 2D Array
		for (int[] i : arr) {
			System.out.print("[ ");
		    for (int j : i) {
		        System.out.print(j + " ");
		    }
		    System.out.println(" ]");
		}
		*/
		sc.close();
	}
}
