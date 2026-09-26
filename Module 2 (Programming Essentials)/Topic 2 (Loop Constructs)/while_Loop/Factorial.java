package while_Loop;

public class Factorial {
	public static void main(String[] args) {
		int number = 5;
		int factorial = 1;
		while (number > 0) {
			System.out.println(factorial +" * "+ number + " = " + (factorial *=number));
//		factorial = factorial *number;
//		factorial *= number; 
		number--;
		}
		System.out.println("Factorial: " + factorial);
		}
}
