package Practice;

public class P5_Grade {
	public static void main(String[] args) {
		int score = 85;
		if (score >= 90 && score <= 100) {
		System.out.println("Grade A: Excellent");
		} else if (score >= 80 && score <= 89) {
		System.out.println("Grade B: Very Good");
		} else if (score >= 70 && score <= 79) {
		System.out.println("Grade C: Good");
		} else if (score >= 60 && score <= 69) {
		System.out.println("Grade D: Needs Improvement");
		} else {
		System.out.println("Grade F: Fail");
		}
		}
}
