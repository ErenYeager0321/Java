package T5_Mastering_AbstractClasses;
/*
6. Layered Abstraction:
In Java, you can have layered abstraction, where one abstract class extends another. This is helpful when you need a multi-level hierarchy, and each level can define more abstract methods for subclasses to implement.
Example:


This example shows how abstraction can be layered to build a hierarchy 
of abstract classes. Calci1 defines the addition and subtraction 
functionality, while Calci2 extends Calci1 and adds multiplication 
and division methods. Calculator is the concrete class that implements 
all abstract methods.
*/

abstract class Calci1 {
	public abstract void add();
	public void sub() {
	System.out.println("Subtraction method in Calci1");
	}
}

abstract class Calci2 extends Calci1 {
	public abstract void multiply();
	public abstract void divide();
}
class Calculator extends Calci2 {
	public void add() {
	System.out.println("Addition functionality");
	}
	public void subtract() {
	super.sub();
	System.out.println("Subtraction functionality");
	}
	public void multiply() {
	System.out.println("Multiplication functionality");
	}
	public void divide() {
	System.out.println("Division functionality");
	}
}
public class T5_LayeredAbstracttion {

}
