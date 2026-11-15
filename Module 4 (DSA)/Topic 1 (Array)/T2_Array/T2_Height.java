package T2_Array;

import java.util.Scanner;

public class T2_Height {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Students");
		double arr[] = new double[sc.nextInt()];// T3 Taking Input ,  Here we taking input in 1D Array
		
//		for (int i = 0; i < arr.length; i++) We can only arr.length for arr length when we dont use'=' in for loop , if we do length-1 so if arr is 4 only 2 will get input and print
		//T2 Traversing In Array , Herr we Traversing(Visiting every memory location of array) usingfor loop
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter Student "+i+" Height");
			arr[i] = sc.nextDouble();	
			}
		
		System.out.print("[");
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.print(arr[i]);
			if(i!= arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
}
