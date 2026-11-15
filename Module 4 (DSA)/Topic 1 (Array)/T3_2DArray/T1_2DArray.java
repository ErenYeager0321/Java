package T3_2DArray;

import java.util.Scanner;

public class T1_2DArray {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
/*		  int arr[][]  = new int[i][j];
			i represent rows
			j represent coloumns
*/		        
//		        int arr[][]  = { // Direct Initialixation
//		            {10, 20, 30},
//		            {40, 50, 60},
//		            {70, 80, 90}
//		        };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. Of Students And Their Marks");
		int arr[][] = new int[sc.nextInt()][sc.nextInt()];
		 for(int i = 0; i <=arr.length-1; i++) { // arr.length Represents Rows
	            for(int j = 0; j <=arr[i].length-1; j++) { // i represents coloumns
	                System.out.println("Enter Marks of Student "+i);
	                arr[i][j] = sc.nextInt();
	           }
		 }
		        for(int i = 0; i <=arr.length-1; i++) {
		        	 System.out.print("[ ");
		            for(int j = 0; j <=arr[i].length-1; j++) {
		                System.out.print(arr[i][j]+" ");
		           }
		            System.out.println("]");
		    }
	 }
}
