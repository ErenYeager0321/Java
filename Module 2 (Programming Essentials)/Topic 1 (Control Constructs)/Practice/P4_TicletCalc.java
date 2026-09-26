package Practice;

public class P4_TicletCalc {
	public static void main(String[] args) {
		int age = 12;
		if (age < 3) {
		System.out.println("Free admission");
		} else if (age >= 3 && age <= 12) {
		System.out.println("Child ticket: $10");
		} else if (age >= 13 && age <= 64) {
		System.out.println("Adult ticket: $15");
		} else {
		System.out.println("Senior ticket: $12");
		}
	}
}
