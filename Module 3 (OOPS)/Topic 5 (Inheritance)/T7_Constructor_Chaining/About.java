package T7_Constructor_Chaining;

/*
  Definition -  Constructor Chaining means Calling Parent class Constructor 
  From child class using SUPER
  
  Simple Explanation:
	Constructor chaining means calling one constructor from another — either 
	within the same class or from the parent class. When you're dealing 
	with inheritance, and you want to call the parent class's constructor 
	from the child class, you use the keyword super().
	It helps pass values and run initialization logic from the parent 
	class, so you don't have to repeat code in the
	child class.
	
	Standard Definition:
	Constructor chaining is a process where a child class constructor 
	explicitly calls the constructor of its parent class using the 
	super() keyword. This ensures that the parent part of the object 
	is properly initialized before the child-specific details are set.
	
	Why Is It Important?
	• Promotes code reuse
	• Helps in initializing parent class fields from child class
	• Avoids writing the same initialization logic again
	• Ensures that the object is built correctly, from top (parent) to 
	bottom (child)
  
*/

class Object {//that is soemthing on java system this will not show , dikhaneke liye likha hai ye
	public Object() {
	// initialization code; 3. JVM comes here intialize the Code
	}// 4. Sees closing
}

class Demo1 extends Object{
//class Demo1  , Real aisa hai , extends Object waha nahi dikhta bas dikhane ke liye likha hai
	// jab class ke aange kuch nai hota to uska Parent Object hota hai
	int a;
	public Demo1() {//2. After Demo2 Super takes the jvm here and again JVm Sees Super will go to Demo1 Parent(object)
		super();
		a = 10;// 5. then it comes here initalizes a=10;
	}// 6. Sees Closing
}

class Demo2 extends Demo1 {
	int b;
	public Demo2(int b){//1.After Defining Obj opf Demo2 JVM will come here with value b=50 and sees super and super will take jvm to his parent class Demo1 
	super(); // Also We will not write super complier will do in its own
	this.b = b; // 7.then JVM Initailizes B = 50
	} // Sees Closing
}

class DemoApp{
	public static void main(String[] args){
	Demo2 d2 = new Demo2(50);
	System.out.println(d2.a + " " + d2.b);
	}
}

public class About {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		DemoApp d =  new DemoApp();
	}
}
