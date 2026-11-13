package T2_Practice;

interface Math1{
	boolean even(int a);
}

public class P4_NumberTester {
	public static void main(String[] args) {
		Math1 isEven = (a)-> a % 2 == 0;
		System.out.println(isEven.even(4));
		System.out.println(isEven.even(7));
	}
}
