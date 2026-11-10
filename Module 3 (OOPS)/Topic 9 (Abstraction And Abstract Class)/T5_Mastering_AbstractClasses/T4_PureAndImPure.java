package T5_Mastering_AbstractClasses;
/*
4. Pure and Impure Abstract Classes:
Pure Abstract Classes: These are abstract classes that only contain abstract methods (no concrete methods). They provide a strict
framework for subclasses to implement the required behaviors.

abstract class Shape {
	abstract double area();
	abstract double perimeter();
}

Impure Abstract Classes: These classes contain both abstract methods (methods without implementations) and concrete methods
(methods with implementations). They provide some default functionality while enforcing that subclasses implement specific abstract
methods.

abstract class Shape {
	abstract double area();
	double perimeter() {
	return 0.0; // Some default implementation
	}
}
*/
public class T4_PureAndImPure {

}
