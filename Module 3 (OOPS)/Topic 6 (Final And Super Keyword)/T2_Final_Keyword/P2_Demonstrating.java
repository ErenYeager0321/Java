package T2_Final_Keyword;

final class FinalClass1 {
	// This class cannot be extended
	public void display() {
		System.out.println("This is a final class.");
	}
}

class Parent1 {
	// Final variable
	final int finalVariable = 10;
	
	// Final method
	public final void finalMethod() {
		System.out.println("This is a final method.");
	}
	
	// Attempt to change the final variable (uncomment to see the error)
	// finalVariable = 20;
	public void display() {
		System.out.println("Parent class display method.");
	}
}
	
class Child1 extends Parent1 {
	// Attempt to override the final method (uncomment to see the error)
	// @Override
	// public void finalMethod() {
	// System.out.println("Attempt to override final method.");
	// }
	@Override
	public void display() {
		System.out.println("Child class display method.");
	}
}

public class P2_Demonstrating {
	public static void main(String[] args) {
		// Create instance of FinalClass
		// Create instance of Parent class
		// Create instance of Child class
		FinalClass1 finalclass = new FinalClass1();
		finalclass.display();
		
		Parent1 parent = new Parent1();
		parent.finalMethod();
		parent.display();
		
		Child1 child = new Child1();
		child.finalMethod();
		child.display();
	}
}
