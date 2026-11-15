package T8_Practice;

import java.util.Scanner;

public class P4_AverageArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
		arr[i] = sc.nextInt();
		}
		
		System.out.print("Array: [");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
			if(i != n-1) {
			System.out.print(", ");
			}
		}
		
		System.out.println("]");
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		
		double avg = sum / n;
		System.out.println("Average: " + avg);
		sc.close();
	}
}
