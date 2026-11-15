package T8_Practice;

import java.util.Scanner;

public class P5_SumOfEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter Array Elements");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Array: [");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
			if(i!=n-1) {
			System.out.print(", ");
			}
		}
		System.out.println("]");
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum Of Even No. Of Array "+sum);
		sc.close();
	}
}
