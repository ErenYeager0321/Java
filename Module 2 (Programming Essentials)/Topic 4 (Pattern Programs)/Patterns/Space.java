package Patterns;

public class Space {
	public static void main(String[] args) {
		//j → lines → 1 to 5
		//k→ Spaces → 1 to 5 in each line
		//i→ *'s → 1 to 5 in each line
		
		for(int j=1;j<=5;j++) {
			
			//every line print 5 spaces
			for(int k=1;k<=5;k++) {
				System.out.print("- ");
				}
			
			//every line print 5 stars
			for(int i=1;i<=5;i++) {
				System.out.print("* ");
				}
			//bring the cursor to next line
				System.out.println();
		}
	}
}
	

