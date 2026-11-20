package T2_MainMethod;
/*
1. can we have main method in an abstract class , yes
2. can we have main method in an inteface
3. can main method be overloaded
4. Will main method be inherited
5. can we make main method as final
6. can we have abstract main method
7. can main mehod be made as protected
8. can we have
public static void main(String... args) ?
if yes what is String ... ?
9. can we override main method.if no why ? if yes how ?
10. can we chnage the return type of main method to int and return 0(zero) to JVM ?
*/
public class T1_IMPQuestions extends q1{
}
// 1
abstract class q1{
	public static void main(String[] args) {
		System.out.println("hello");
	}
}

/*2. Can we have a main method in an interface?
Yes
An interface can also contain a main method.
Since Java 8, interfaces can have static methods, and the main method is static.
Example:
</> Java */
interface A
{
	public static void main(String[] args){
		System.out.println("Main method in Interface");
	}
}

/*
3. Can the main method be overloaded?
Yes
Method overloading means creating multiple methods with the same name but different parameters.
We can overload the main method by changing its parameters.
Example:
</> Java
*/
class Test{
	public static void main(String[] args){
		System.out.println("Original Main Method");
		main(10);
	}
	public static void main(int a){
		System.out.println("Overloaded Main Method");
	}
}
/*
4. Will the main method be inherited?
Yes
The main method is static, and static methods can be inherited.
Example:
</> Java 
class A{
	public static void main(String[] args){
	System.out.println("Main method of A");
	}
}
class B extends A{

}
*/

/* 5. Can we make the main method final ?
Yes
We can make the main method final because a static method can also be final.
final means the method cannot be overridden or hidden by a subclass.
Example:
</> Java 
class Test{
	public static final void main(String[] args){
	System.out.println("Final Main Method");
	}
} */

/*
6. Can we have an abstract main method?
No
An abstract method has no body and must be implemented by a subclass.
But the main method is static.
In Java, a static method cannot be abstract because abstract methods require overriding, whereas static methods cannot be overridden.
Example (Invalid):

abstract class Test{
	public abstract static void main(String[] args);
}
Error: Illegal combination of modifiers: abstract and static.
Remember: Static methods cannot be abstract.
*/

/*
7. Can the main method be made protected ?
Not as a standard entry point
We can declare a main method as protected, but the traditional Java launcher will not accept it as the
application's entry point.
Example:
</> Java
class Test{
	protected static void main(String[] args){
	System.out.println("Hello Java");
	}
}
This code compiles successfully, but running it directly using the traditional Java launcher will produce a
main-method error.
Why?
Because the traditional entry point requires the main method to be public.
Remember: protected main can be declared, but it cannot serve as the traditional JVM launch entry point.
*/

/*
8. Can we write public static void main(String... args)?
Yes
We can write:
	public static void main(String... args){
	System.out.println("Hello Java");
	}
It works exactly like:
	public static void main(String[] args){
	System.out.println("Hello Java");
	}

What is String...?
It is called Varargs (Variable Arguments).
It allows us to pass multiple arguments to a method without creating an array manually.
Example:
class Test{
	public static void main(String... args){
		for(String s : args){
		System.out.println(s);
		}
	}
}
Run with command-line arguments:
Plain text
java Test Hello Java World
*/

/*
9. Can we override the main method? If no, why? If yes, how?
No, we cannot override it
The main method is static.
Static methods cannot be overridden because method overriding requires runtime polymorphism, whereas static methods are resolved using the reference class.
However, we can hide the main method.
This is called Method Hiding.
Example:
class A{
	public static void main(String[] args){
		System.out.println("Main of A");
	}
}
class B extends A{
	public static void main(String[] args){
		System.out.println("Main of B");
	}
}
*/

/*
10. Can we change the return type of main to Int and return 0 to JVM?
No
The standard Java entry-point main method must have a void return type.
Invalid example:
```java
class Test
{
public static int main(String[] args)
{
System.out.println("Hello Java");
return 0;
}
}
```
This code compiles successfully, but the traditional Java launcher will not recognize it as the application's entry point.
Correct example:
```java
class Test
{
public static void main(String[] args)
{
System.out.println("Hello Java");
}
}
```
Why void?
Because the Java launcher expects the main method not to return a value.
Remember: Unlike C and C++, Java's main method does not return to indicate successful execution.

Quick Revision Table (Important for Viva)
No. Question Answer
1 Main in abstract class? Yes
2 Main in interface? Yes
3 Can main be overloaded? Yes
4 Is main inherited? Yes
5 Can main be final? Yes
6 Can main be abstract? No
7 Can main be protected? Not as a traditional entry point
8 Can we use String... args? Yes
9 Can main be overridden? No, but it can be hidden
10 Can main return int? No, not as an entry point

Most Important Concepts to Remember
1. Overloading - Same method name, different parameters.
2. Overriding - Child class provides its own implementation of an inherited instance method.
3. Method Hiding - Child class declares a static method with the same signature as the parent's static method.
4. Varargs - String... args allows variable numbers of arguments.
5. Static - Belongs to the class, not an object. 
*/