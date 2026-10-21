package T2_Final_Keyword;

//Final class
final class FinalClass {
	void display() {
	System.out.println("This is a method from the FINAL CLASS.");
	}
}

/*  
Trying to extend a final class will result in a compile-time error
class SubClass extends FinalClass {
	void display() {
	System.out.println("Attempting to inherit from a final class.");
	}
}
*/


public class Final3_Class {
	public static void main(String[] args) {
		FinalClass finalClass = new FinalClass();
		finalClass.display();
		}
}
