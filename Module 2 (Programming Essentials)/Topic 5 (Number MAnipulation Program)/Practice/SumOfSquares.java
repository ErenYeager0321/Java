package Practice;

public class SumOfSquares {
	public static void main(String[] args) {
		Square sq = new Square();
		sq.sq(5);
	}
}
	class Square {
			public void sq(int n) {
				int sum = 0;
			for(int i = 1; i<=n; i++) {
				sum += i*i;
			}
		System.out.println("The sum of the squares of the first "+n  +" natural numbers is " +sum+".");
	}
}