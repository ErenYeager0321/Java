package T9_Method_Types;

class Parent {
	// Method to be inherited by the child class
	public void inheritedMethod() {
		System.out.println("This is the inherited method from Parent.");
	}
	
	// Method to be overridden by the child class
	public void overriddenMethod() {
		System.out.println("This is the overridden method in Parent.");
	}
}

class Child extends Parent {
	
	// Override the method from the Parent class
	@Override
	public void overriddenMethod() {
		System.out.println("This is the overridden method in Child.");
	}
	
	// Child-specific method
	public void childSpecificMethod() {
		System.out.println("This is the child-specific method.");
	}
}

class Main {
	public static void main(String[] args) {
	// Create an instance of Child and demonstrate method calls
	Child ch = new Child();
	ch.inheritedMethod();
	ch.overriddenMethod();
	ch.childSpecificMethod();
	}
}

public class P2_Demostration {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Main m =  new Main();
	}
}
