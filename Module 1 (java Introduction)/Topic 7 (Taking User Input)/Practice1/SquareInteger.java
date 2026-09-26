package Practice1;

import java.util.Scanner;

public class SquareInteger {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			int result = SquareInteger.Square(a);
			System.out.println(result);
			
		}
		
		public static int Square(int square) {
			int b = square *square;
			return b;
		}
}
