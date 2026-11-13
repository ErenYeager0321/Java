package T2_Practice;

interface Math{
	int add (int a , int b);
}

public class P2_Math {
	public static void main(String[] args) {
		Math m = (a,b)->a+b;
		System.out.println(m.add(10, 20));
	}
}
