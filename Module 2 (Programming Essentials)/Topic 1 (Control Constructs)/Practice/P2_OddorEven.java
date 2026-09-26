package Practice;
import java.util.Scanner;
public class P2_OddorEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		checkOddEven(number);
		}
		public static void checkOddEven(int number) {
		if(number % 2 == 0) {
		System.out.println("Even");
		} else
		System.out.println("Odd");
		}
}
