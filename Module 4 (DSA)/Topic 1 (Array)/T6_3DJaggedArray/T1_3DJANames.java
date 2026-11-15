package T6_3DJaggedArray;

import java.util.Scanner;

public class T1_3DJANames {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String names[][][] = new String[3][][];
		//Direct Initialization
//		names[0] = new String[3][];
//		names[1] = new String[4][];
//		names[2] = new String[2][];
//
//		names[0][0] = new String[2];
//		names[0][1] = new String[3];
//		names[0][2] = new String[4];
//		
//		names[1][0] = new String[2];
//		names[1][1] = new String[3];
//		names[1][2] = new String[1];
//		names[1][3] = new String[8];
//		
//		names[2][0] = new String[4];
//		names[2][1] = new String[3];
		
		// User Input Initialization
		for (int i = 0; i <= names.length-1; i++) {
			System.out.println("Enter No. Classes/1st Dimension Length in School "+i);
			names[i] = new String[sc.nextInt()][];
		}
		
		for (int i = 0; i <= names.length-1; i++) {
			for (int j = 0; j <= names[i].length-1; j++) {
				System.out.println("Enter No. Of Students/2nd Dimension Length In School "+i+" Class "+j);
				names[i][j] = new String[sc.nextInt()];
			}
			System.out.println("");
		}
		sc.nextLine();
		for (int i = 0; i <= names.length-1; i++) {
			for (int j = 0; j <= names[i].length-1; j++) {
				for (int k = 0; k <= names[i][j].length-1; k++) {
					System.out.println("Enter Names/3rd Dimension Length Of Students Class "+i+" School "+j);
					names[i][j][k] = sc.nextLine();
				}
			}
		}
		
		for (int i = 0; i <= names.length-1; i++) {
			System.out.print("{ ");
			for (int j = 0; j <= names[i].length-1; j++) {
				System.out.print("[ ");
				for (int k = 0; k <= names[i][j].length-1; k++) {
					System.out.print(names[i][j][k]);
					if(k!= names[i][j].length) {
						System.out.print(",");
					}
				}
				System.out.print(" ]");
			}
			System.out.println(" }");
		}
		
	}
}
