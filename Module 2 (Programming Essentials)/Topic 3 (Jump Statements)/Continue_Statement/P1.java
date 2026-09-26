package Continue_Statement;

public class P1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
		if (i % 3 == 0) {
		System.out.println("Number " + i + " is skipped.");
		continue;
		}
		sum += i;
		System.out.println("Number " + i + " is added. Current sum: " + sum);
		}
		System.out.println("Final sum: " + sum);
		}
}
