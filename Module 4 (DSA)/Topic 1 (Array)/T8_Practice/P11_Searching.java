package T8_Practice;

import java.util.Scanner;

public class P11_Searching {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("Take Input");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i!= arr.length) {
				System.out.print(",");
			}
		}System.out.println(" ]");
		
		// Now See if 5 is present in array or not
		System.out.println("Enter Key To Search");
		int key = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] == key) {
//				key = arr[i];
//			}
			if(key == arr[i]) {// *Sequential/Linear Search Algorithm
				System.out.println("Key Found At Index "+i);
				return;// Agar Key founf hui to aage print nai hoga iske liye return use kra , break sirf condition rokega loop ke bahar nahi
			}
		}
//		System.out.println(key);
		System.out.println("Key Not Found  ");
		sc.close();
	}
}
