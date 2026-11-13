package T2_Practice;

import java.util.Scanner;

public class CalcApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc c = (a,b)->(a+b);
		Calc c1 = (a,b)->(a-b);
		Calc c2 = (a,b)->(a*b);
		Calc c3 = (a,b)->(a/b);
		System.out.println("Enter Number");
		System.out.println(c.cal(sc.nextInt(), sc.nextInt()));
		System.out.println(c1.cal(sc.nextInt(), sc.nextInt()));
		System.out.println(c2.cal(sc.nextInt(), sc.nextInt()));
		System.out.println(c3.cal(sc.nextInt(), sc.nextInt()));
		
	/*	System.out.println(c.cal(2, 2));
		System.out.println(c1.cal(2, 2));
		System.out.println(c2.cal(2, 2));
		System.out.println(c3.cal(2, 2));
	  */ 
	}
}
