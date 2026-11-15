package T8_Practice;

import java.util.Scanner;

public class P3_FindMaximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter Array Elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Array: [");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if(i != arr.length-1) {
			System.out.print(", ");
			}
		}
		System.out.println("]");
		
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum No. in Array :"+max);
		System.out.println("Minimum No. in Array :"+min);
		sc.close();
	}
}
