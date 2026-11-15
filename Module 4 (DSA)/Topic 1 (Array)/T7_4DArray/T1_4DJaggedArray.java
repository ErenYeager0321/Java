package T7_4DArray;

import java.util.Scanner;

public class T1_4DJaggedArray {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter universities");
		int arr[][][][]=new int[scan.nextInt()][][][];

		for(int i=0;i<=arr.length-1;i++) {
		System.out.println("Enter no of colege for university "+i);
		arr[i]=new int[scan.nextInt()][][];
		}
		
		for(int i=0;i<=arr.length-1;i++){
			for(int j=0;j<=arr[i].length-1;j++){
			System.out.println("Enter number of class for university"+i+" college "+j);
			arr[i][j]=new int[scan.nextInt()][];
			}
		}
		
		for(int i=0;i<=arr.length-1;i++){
			for(int j=0;j<=arr[i].length-1;j++){
				for (int k = 0; k <= arr[i][j].length; k++) {
					System.out.println("Enter number of Students for University"+i+" College "+j+" Class "+k);
					arr[i][j][k]=new int[scan.nextInt()];
				}
			}
		}
		
		for(int i=0;i<=arr.length-1;i++){
			for(int j=0;j<=arr[i].length-1;j++){
				for (int k = 0; k <= arr[i][j].length; k++) {
					for (int l = 0; l <= arr[i][j][k].length; l++) {
						System.out.println("Enter Marks of Student for University"+i+" College "+j+" Class "+k);
						arr[i][j][k][l]=scan.nextInt();
					}
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("{ ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("[");
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print("(");
					for (int l = 0; l < arr[i][j][k].length; l++) {
						System.out.print(arr[i][j][k][l]);
						if(l!= arr[i][j][k].length) {
							System.out.print(",");
						}
					}
					System.out.print(")");
				}
				System.out.print("] ");
			}
			System.out.println(" }");
		}
		
	}
}
