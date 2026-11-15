package T5_3DArray;

import java.util.Scanner;
/*

Scenario 

Schools Classes Students
0         0 	012
 		  1		012

1 		  0 	012
 		  1		012

2 		  0 	012
		  1		012

3 		  0     012
 		  1		012

*/
public class T1_3Darray {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks[][][] = new int[4][2][3];
		
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {
				for (int k = 0; k < marks[i][j].length; k++) {
					System.out.println("Enter Marks Of School "+i+" Class "+j+" Student "+k );
				marks[i][j][k] = sc.nextInt();
				}
				System.out.println("");
			}
		}
		
		for (int i = 0; i < marks.length; i++) {
			System.out.print("{ ");
			for (int j = 0; j < marks[i].length; j++) {
				System.out.print("[");
				for (int k = 0; k < marks[i][j].length; k++) {
					System.out.print(marks[i][j][k]);
					if(k!= marks.length) {
						System.out.print(",");
					}
				}
				System.out.print("]");
			}
			System.out.println("}");
		}
	}
}
