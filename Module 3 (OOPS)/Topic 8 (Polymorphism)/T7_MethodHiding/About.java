package T7_MethodHiding;
/*
What Exactly is Method Hiding?
Standard Definition:
Method Hiding happens when a static method in the child class has the same 
name and parameters as a static method in the parent class. In this case, 
the method in the child class hides the method in the parent class.

Simple Explanation:
In Java, if a parent class has a static method, and the child class creates 
another static method with the same name and same inputs, then the child 
method does not replace the parent method. It simply hides it. This is 
because static methods belong to the class, not the object. So Java will 
decide which method to run based on the class reference, not based on the 
actual object created.Now let us understand why this concept is important in Java.

Why is Method Hiding Important?
Here are some simple reasons why method hiding is important:
• It helps us to understand how static methods behave when they are used in parent-child class relationships.
• It shows that static methods are connected to the class, not to objects.
• It helps us avoid confusion when both parent and child classes have methods with the same name.
• It teaches us that static methods cannot be overridden, they can only be hidden.
• It helps us write better and cleaner code in real-world Java projects.
• Now that we know why it's important, let us learn the basic rules of method hiding.
*/
class Demo{
	void display() {
		System.out.println("Hello From PARENT");
		}
	static void sample() {
		System.out.println("Sampling from parent");
		}
}

class Demo1{
	void display() {
		System.out.println("Hello From CHILD");
		}
	static void sample() {
		System.out.println("Sampling from CHILD");
		}
}
public class About {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Demo d1 = new Demo();
//		Demo1 d1 = new Demo1();
		d1.display();
		d1.sample();//===> Demo1.sample() Here Child Sample is Hidden For Demo Type , If Demo1 parent sample will be hidden , 
		//Static Cant Be Override , It belongs to which type we calling it whether it is reference and type(d1.sample or Demo1.sample) , 
		//like here Demo will call the Parent Sample And Demo1 Will Call the CHild sample
		}
}
