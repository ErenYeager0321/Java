package T4_Practice;

import java.util.Scanner;

public class P2_JaggedArrayMarks {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. Of Classes/i");
		int marks[][] = new int[sc.nextInt()][];
		
		for (int i = 0; i <=marks.length-1; i++) {
			System.out.println("Enter No. of Students/J for Class "+i);
			marks[i] = new int[sc.nextInt()];
		}
		
		for (int i = 0; i <=marks.length-1; i++) {
			for (int j = 0; j <=marks[i].length-1; j++) {
				System.out.println("Enter Marks of Students of Class "+i);
				marks[i][j] = sc.nextInt();
			}
		} 
		
		for (int i = 0; i <= marks.length-1; i++) {
			System.out.print("[ ");
			for (int j = 0; j<=marks[i].length-1; j++) {
				System.out.print(marks[i][j]);
				if(j!= marks.length-i) {
					System.out.print(",");
				}
			}
			System.out.println(" ]");
		}
	}
}
