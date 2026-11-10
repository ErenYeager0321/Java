package T5_Mastering_AbstractClasses;
/*
2. Abstract vs. Concrete Classes:
In Java, classes that are not abstract are known as concrete classes. 
Concrete classes are fully defined and can be instantiated directly.
On the other hand, abstract classes cannot be instantiated, and they 
often contain abstract methods — methods without a body —
which must be implemented by the subclasses.

Concrete Class Example:

Here, Rectangle is a concrete class because it has a fully defined method 
calculateArea().
*/
public class T2_AbstractVsConcrete {
	class Rectangle {
		int length;
		int breadth;

		int calculateArea() {
		return length * breadth;
		}
	}
}
