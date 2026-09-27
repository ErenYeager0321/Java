package Practice;

public class Natrural_No_Sum {
	public static void main(String[] args) {
		Snum s = new Snum();
		System.out.println("The sum of the first 50 natural numbers is " + s.snum(50));
	}
}
		class Snum {
		public int snum(int n) {
		int sum = 0;
		for(int i = 1; i<=n;i++) {
			sum += i;
		}
		return sum;
	}
}
