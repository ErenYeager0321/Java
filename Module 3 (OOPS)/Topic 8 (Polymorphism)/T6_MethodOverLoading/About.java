package T6_MethodOverLoading;
/*
What Exactly is Method Overloading?
Standard Definition:
Method Overloading means having multiple methods with the same name but different parameters (number or
type) in the same class.
Simple Explanation:
Let's say you have a mobile app where users can search for restaurants. Some people search by name, some by location,
and some by food type. Instead of creating three different methods like searchByName(), search ByLocation(), and
searchByFood(), we can create one method called search(). Inside the code, it'll behave differently depending on
what input the user gives. This way, we reuse the same method name for different jobs - just like how Ravi plays
different roles without changing his name. Now that you've understood what method overloading is, let's talk about why
it matters in programming.
*/
class Calculator {
	void add(int a, int b) {
		System.out.println("Sum of two whole numbers: " + (a + b));
	}
	void add(double a, double b) {
		System.out.println("Sum of two decimal numbers: " + (a + b));
	}
	void add(int a, int b, int c) {
		System.out.println("Sum of three numbers: " + (a + b + c));
	}
}
public class About {
	public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.add(5, 3);
	calc.add(2.5, 4.5);
	calc.add(1, 2, 3);
	}
}


