package Static_4Block;

import java.util.Scanner;

public class P5_AreaCalculator {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if(s.equals("Rectangle")) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The area of the rectangle is: "+A.rec(a,b));
		} else {
		double e = sc.nextDouble();
		System.out.println("The area of the circle is: "+A.cr(e));
		}
	}
}
class A {
	public static int rec(int a, int b) {
		return a*b;
	}
	public static double cr(double e) {
		return Math.PI * e * e;
	}
}