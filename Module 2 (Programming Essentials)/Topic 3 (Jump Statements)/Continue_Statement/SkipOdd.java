package Continue_Statement;

public class SkipOdd {
	public static void main(String[] args) {
		int limit = 10;
		for (int number = 1; number <= limit; number++) {
		if (number % 2 != 0) {
		continue;
		}

		System.out.println(number);
		}
		}
}
