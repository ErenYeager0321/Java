package T2_Array;

import java.util.Scanner;

public class T1_Array {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		int arr[] = new int[5]; Instead of that give no. of array by urself
//		arr[0]=91;// we Can store inside the array like that too
//		System.out.println(arr[0]); // And Like that we can print
// instead of Storing and printing every value of array we can use FOR Loop
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Students ");
		int arr[] = new int[sc.nextInt()];// Creating An Array
		
//	Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<=arr.length-1 ; i++) { // instead of typing 4 we can use arr.length-1(Length is an attribute) and (-1) is bcz array size is 5 and index of arr5 is 4.
			System.out.println("Enter Marks Of Student "+i);
			arr[i] = sc.nextInt();
		}
		
		System.out.print("[");
		for(int i=0; i<=arr.length-1 ; i++) {
			System.out.print(arr[i]/*+","*/);
			if(i!=arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}
