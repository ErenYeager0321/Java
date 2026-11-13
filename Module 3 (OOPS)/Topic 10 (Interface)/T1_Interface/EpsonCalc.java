package T1_Interface;

import java.util.Scanner;

public class EpsonCalc implements Calc {
	int a;
	int b;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void add() {
		System.out.println("Enter 2 No.");
		a = sc.nextInt();
		b = sc.nextInt();
		int c = a+b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		System.out.println("Enter 2 No.");
		a = sc.nextInt();
		b = sc.nextInt();
		int c = a-b;
		System.out.println(c);

	}

	@Override
	public void mul() {
		System.out.println("Enter 2 No.");
		a = sc.nextInt();
		b = sc.nextInt();
		int c = a*b;
		System.out.println(c);

	}

	@Override
	public void div() {
		System.out.println("Enter 2 No.");
		a = sc.nextInt();
		b = sc.nextInt();
		int c = a/b;
		System.out.println(c);

	}

}
