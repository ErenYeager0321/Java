package T1_Super_Keyword;

/*  *IMP* Thats How we need to explainin interview
	this keyword: resolve shadowing problem
	this(): used in local chaining , calling another constructor present in same class
	super:keyword - access parent properties from child class
	super(): used in super constructor chaining-calling ,calls parent class constructor from child class
*/
class parent {
	int a = 10;
	void display() {
		System.out.println(a+" From Parent");
	}
}

class child extends parent {
	int a = 20;
	void display1() {
		super.display();// This Super will call parent class display function
		System.out.println("From Child "+a);
		System.out.println("From Child "+super.a); // this SUPER will call the Parent class Variable
		
	}
}

public class Super {
	public static void main(String[] args) {
		child c = new child();
		c.display1();
	}
}
