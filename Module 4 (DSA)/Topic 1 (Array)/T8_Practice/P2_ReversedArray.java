package T8_Practice;

import java.util.Scanner;

public class P2_ReversedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		int []arr = new int[n];
		
		System.out.print("Original array: [ " );
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.print(arr[i]);
			if(i!=arr.length-1) {
			System.out.print(", ");
			}
		}System.out.println(" ]");
		int rev;
		System.out.print("Reversed array: [");
		for(int i=0; i<arr.length/2; i++) {
			rev = arr[i];
			arr[i] = arr[(n-1)-i];
			arr[(n-1)-i] = rev;
			}

		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
			if(i != n-1) {
			System.out.print(", ");
			}
		}
		
		System.out.print("]");
		sc.close();
	}
}
