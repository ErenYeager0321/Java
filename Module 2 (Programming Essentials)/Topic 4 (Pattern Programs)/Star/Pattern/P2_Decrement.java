package Star.Pattern;

public class P2_Decrement {
	public static void main(String[] args) {
		for (int j = 5; j >=1; j--) {
			for (int i = 1; i <=j; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//2nd method
		for(int j=1;j<=5;j++) {
			for(int i=5;i>=j;i--) {
			System.out.print("* ");
			}
			System.out.println();
		}
	}
}
