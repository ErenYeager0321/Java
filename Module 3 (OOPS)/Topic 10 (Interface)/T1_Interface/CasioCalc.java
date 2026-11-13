package T1_Interface;

public class CasioCalc implements Calc{
	int a = 10;
	int b = 10;
	public void add() {
		int c = a+b;
		System.out.println(c);
	}

	public void sub() {
		int c = a-b;
		System.out.println(c);
	}

	public void mul() {
		int c = a*b;
		System.out.println(c);
	}

	public void div() {
		int c = a/b;
		System.out.println(c);
	}
}
