package T4_2D_JaggedArray;

import java.util.Scanner;

public class P1_Names {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner sc =  new Scanner(System.in);
		 // Entering no. of classes
		 System.out.println("Enter number of classes that is 1st-Dimension[i] length");
		 String arr[][] = new String[sc.nextInt()][];
		 
		 //Enter No.of students in classes
		 for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("Enter number of students in class "+i+" that is 2nd-Dimenson[j] length");
			arr[i] = new String[sc.nextInt()];
		} System.out.println("");
		 
		// Entering Name of Students
		 for (int i = 0; i <=arr.length-1; i++) {
			for (int j = 0; j <=arr[i].length-1; j++) {
				System.out.println("Enter the Name of class "+i+" Student "+j);
				arr[i][j] =  sc.next();
			}
			System.out.println("");
		}
		 
		 //printing names
		 for(int i = 0; i <=arr.length-1; i++) {
        	 System.out.print("[ ");
            for(int j = 0; j <=arr[i].length-1; j++) {
                System.out.print(arr[i][j]);
                if(j!= arr[i].length-1) {
                	System.out.print(",");
                }
           }
            System.out.println(" ]");
		 }
	}
}
