package Practice;

public class P7_SimpleCalc {
	public static void main(String[] args) {
		double num1 = 10.5;
		double num2 = 2.5;
		char operator = '+';

		switch (operator) {
		case '+':
		System.out.println("Result: " + (num1 + num2));
		break;
		case '-':
		System.out.println("Result: " + (num1 - num2));
		break;
		case '*':
		System.out.println("Result: " + (num1 * num2));
		break;
		case '/':
		System.out.println("Result: " + (num1 / num2));
		break;
		default:
		System.out.println("Invalid operator");
		}
		}
}
