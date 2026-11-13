package T3_StaticNestedClass;

class Calc{
	static class MathOperations {
		public static int add(int a, int b) {
			return a + b;
		}
		public static int subtract(int a, int b) {
			return a - b;
		}
		public static int multiply(int a, int b) {
			return a * b;
		}
		public static double divide(int a, int b) {
			return (double) a / b;
		}
	}
}

public class P1_Calc {
	public static void main(String[] args) {
//		Calc.MathOperations m = new Calc.MathOperations();// No Need of obj for static
		System.out.println(Calc.MathOperations.add(10, 10));
	}
}
