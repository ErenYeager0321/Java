package Project;

public class Save_Trees {
	public static void main(String[] args) {
		for (int j = 1; j <=7; j++) {
			for (int i = 9; i >=j; i--) {
				System.out.print(" ");
				}
			for (int k = 1; k <=j; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int m = 1; m <=2; m++) {
			for (int n = 1; n <=2; n++) {
				System.out.print("   ");
			}
			for (int o = 1; o <=3; o++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("     SAVE TREES");
	}
}
