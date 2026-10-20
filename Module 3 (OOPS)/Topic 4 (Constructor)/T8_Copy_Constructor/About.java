package T8_Copy_Constructor;

public class About {
	/*  Standard Definition:
	A copy constructor in Java is a special constructor that takes
	 another object of the same class as its parameter and copies 
	 its values into the new object.
	
	Simple Explanation:
	Imagine you have one book object and you want to make a copy
	— not just another reference pointing to the same object, but an actual 
	separate object that has the same data.
	A copy constructor allows you to clone an object safely and easily 
	— just by passing one object into another.
	
	Why Is It Important? 🎯
	
	The copy constructor is important for several reasons:
	It allows you to create a new object with the same data as an existing object
	It avoids repeating the same assignments manually for every field
	It keeps your code clean, short, and easy to understand
	It makes sure the new object is separate — so changes to it don’t affect the original
	It gives your class a professional design, especially in real-world applications
	In short, copy constructors give you control, simplicity, and safety when working with objects that need to be duplicated.
	
	Syntax for Copy Constructor 🔍
	Here are some basic things to know about copy constructors:
	A copy constructor has this general form:
	
	ClassName(ClassName object) {
	    this.field1 = object.field1;
	    this.field2 = object.field2;
	    // ...and so on
	}
	The constructor takes one argument, which is an object of the same class
	It copies each variable from the existing object to the new object
	Java does not provide a copy constructor by default — you must write it yourself
	It creates a deep copy for simple types (like int, String), but for objects, you may need to write a custom deep copy if needed
	The new object and the original are stored in different memory locations — so they don’t affect each other
	  */
}
