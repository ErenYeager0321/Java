package T8_Practice;

import java.util.Scanner;

public class P1_ArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int arr[] = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Array "+i);
			arr[i] = sc.nextInt();
		}
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i!= arr.length) {
				System.out.print(",");
			}
		}
		System.out.println(" ]");
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += i;
		}
		System.out.println("Sum Of Array :"+sum);
		sc.close();
	}
}
