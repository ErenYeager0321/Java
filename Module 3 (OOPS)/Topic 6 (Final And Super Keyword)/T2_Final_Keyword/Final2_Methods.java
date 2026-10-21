package T2_Final_Keyword;

/*
  Definition:
	A final method is a method that cannot be overridden by a child class. It is like saying:
	"This method is very important. Don't change how it works."
	
	When to Use:
	Use final methods when you want to prevent other classes from changing how a method works — for
	example, if it contains important logic or security-related code.
	
	
*/

class Parent {
	// Final method
	final void show() {
	System.out.println("This is a final method from the Parent class.");
	}
}

class Child extends Parent {
	// Trying to override the final method will result in a compile-time error
	// void show() {
	// System.out.println("Attempting to override the final method.");
	// }
}


public class Final2_Methods {
	public static void main(String[] args) {
		Child child = new Child();
		child.show();
		}
}
