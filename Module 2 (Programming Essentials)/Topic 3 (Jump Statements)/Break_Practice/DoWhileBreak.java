package Break_Practice;

public class DoWhileBreak {
	public static void main(String[] args) {
		int i = 10;
		do {
			System.out.println("Java is Cool");
			i--;
			if (i == 5) {
				break;
			}
		} while (i > 0);
	}
}
