package Practice;
import java.util.Scanner;
public class P1_MultipleOf5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No.");
		int number = scanner.nextInt();
		checkMultipleOfFive(number);
		}
		public static void checkMultipleOfFive(int number) {
		if(number % 5 == 0) {
		System.out.println("Multiple of 5");
		System.out.println("Program ended");
		}
		else
		System.out.println("Program ended");
		}
}
