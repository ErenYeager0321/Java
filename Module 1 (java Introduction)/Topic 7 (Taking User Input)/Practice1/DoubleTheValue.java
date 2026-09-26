package Practice1;

import java.util.Scanner;

public class DoubleTheValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		
		double result = DoubleTheValue.doubleDouble(a);
		System.out.println(result);
		
		}
	
		public static double doubleDouble(double value) {
			double a = value * 2;
			return a;
		}
			
}
