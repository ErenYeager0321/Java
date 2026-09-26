package Star.Pattern;

public class Middle_Space {
	public static void main(String[] args) {
		for(int j=1;j<=5;j++){
			for(int i=1;i<=5;i++){
				if(j==1 || j==5 || i==1 || i==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
