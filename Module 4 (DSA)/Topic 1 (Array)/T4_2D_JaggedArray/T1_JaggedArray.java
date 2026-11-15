package T4_2D_JaggedArray;

import java.util.Scanner;

public class T1_JaggedArray {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
/*		classes             students
		0					0 1 2 3
		1					0 1
		2					0 1 2
		3					0 1 2 3 4

		int arr[][] = new int[4][];// In Jagged(Jig Jag) Array we dont declare no of coloumns/Students
		arr[0]=new int[4]; //arr[0] Repre Row No. ,  new int[4]; Repre No. Of Coloumns will be in that row
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[5];
	*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number of classes that is 1st-Dimension[i] length");
		int arr[][] = new int[scan.nextInt()][];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter number of students in class "+i+" that is 2nd-Dimenson[j] length");
			arr[i]=new int[scan.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println("Enter the marks of class "+i+" Student "+j);
			arr[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print("[ ");
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]);
				if(j!=arr[i].length-1) {
					System.out.print(",");
				}
			}
			System.out.println(" ]");
		}
	}
}
