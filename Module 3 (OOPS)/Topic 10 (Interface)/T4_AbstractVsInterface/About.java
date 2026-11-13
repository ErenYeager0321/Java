package T4_AbstractVsInterface;
/*

Difference btw Abstract And Interface

1.keyword Abstract
  Keyword Interface
  
2.its a class
  its a interface
  
3.A class can extend only one abs class
  A class can implement multiple interface
  
4.Abstract Varibale can have any type of variable
  Variable are constant(final by default , public and static ) 

5.Can Have Abstract Methods and Concrete(Non Abstracte) Mehtods(Method with Body)
  Primarily have Only Abstract Mthods(or Default, staic, private) 
  
6.*Multiple inheritance isnt possible in abs but possible in interface.

7.Cant use Default keyword
  can use
  
8.Abstract Class get extends
  Interface gets Implemented 
  
9.Both can have Main Method 
  interface can only have Main Method when it is static

Abstract Class	                               Interface
1.Declared using abstract keyword.	         Declared using interface keyword.
2.Can have abstract and non-abstract methods.	 Can have abstract, default, static and private methods.
3.Can have constructors.	                     Cannot have constructors.
4.Can have instance variables.	             Variables are by default public static final.
5.Supports single inheritance.	             Supports multiple inheritance.
6.A class extends an abstract class.	         A class implements an interface.
7.Methods can have any access modifier.	     Abstract methods are public by default.
8.Used when classes share common properties and behaviour.	Used to define a common contract for different classes.


1. Purpose: What Do They Do?
* Abstract Classes:
An abstract class is like a partially finished blueprint. It allows us to create some common behavior that different classes can share. We use abstract classes when we want to give some shared functionality but also leave some parts for the specific class to fill in.
Example: Think of an abstract blueprint for a vehicle. It might include a method to start the vehicle, but we may want different vehicles to have different ways to stop. So, the stop method can be left for the specific vehicle to define.
* Interfaces:
An interface is like a set of rules. It defines what methods a class should have, but doesn't provide any code for them. The class that implements the interface has to define how the methods work. Interfaces are great when we want to make sure classes follow the same set of rules, but they can still implement those rules their own way.
Example: Think of an interface for a machine. It might have methods like turnOn() and turnOff(), but it doesn't say how these methods should work. Each machine class (like a fan or a light) will decide how to turn itself on and off.

2. How Are They Used?
* Abstract Classes:
Abstract classes are meant to be extended. A class can only extend one abstract class, which means you can only inherit from one parent. This can be limiting if you need a class to inherit from multiple sources.
Example: If you have an abstract class Vehicle, and another abstract class Engine, your Car class can only extend one of them, not both.
* Interfaces:
A class can implement multiple interfaces. This is a huge advantage over abstract classes because a class can inherit behaviors from multiple sources. This is known as multiple inheritance and is supported only by interfaces in Java.
Example: A class Smartphone can implement both Camera and GPS interfaces, getting features from both without any conflict.

3. Can We Have Code in Them?
* Abstract Classes:
Abstract classes can have both abstract methods (methods without code) and concrete methods (methods with code). This means an abstract class can provide some shared behavior and leave other parts for the classes to define.
Example: An abstract class Animal might have an abstract method makeSound(), but also a concrete method eat(), which gives the shared behavior of eating.
* Interfaces:
Interfaces, before Java 8, could only have abstract methods (without code). However, starting from Java 8, default methods can have code in interfaces. Still, interfaces primarily focus on what needs to be done, while the class decides how to do it.
Example: An interface Device might have an abstract method turnOn(), but could also have a default method turnOff() with some predefined code for how a device turns off.

4. Variables: What About Them?
* Abstract Classes:
In abstract classes, you can have variables with any access level (private, protected, public). These variables can have values that are shared by all subclasses.
* Interfaces:
In interfaces, all variables are constants. They are implicitly public, static, and final, meaning their values can't be changed once set. Interfaces are used for shared constants across classes.
Example: In an interface, you might define a constant MAX_SPEED = 100, and all classes implementing that interface will have access to that value.

5. When to Use Them?
* Use Abstract Classes:
When you want to provide some common behavior and leave the rest for the subclass to implement. Abstract classes are ideal when you have a common base with shared functionality.
Example: Use an abstract class for a Vehicle that has shared methods like start() and stop(), but the specific type of vehicle (like Car or Bike) will define how to implement them.
* Use Interfaces:
When you want to define a set of rules that different classes should follow, but don't care about how they do it. Interfaces are perfect when you want multiple behaviors from different sources.
Example: Use an interface for something like Chargeable, where classes like Smartphone, Laptop, and ElectricCar can implement the charge() method in their own way.

Key Differences at a Glance:
Feature |           Abstract Class                |              Interface
Inheritance | A class can extend only one abstract class | A class can implement multiple interfaces
Code Inside | Can have abstract methods and concrete methods | Primarily abstract methods (can have default methods from Java 8)
Variables | Can have instance variables | Variables are constants (public, static, final)
Purpose | Used when sharing common functionality | Used to define a set of rules or behaviors
When to Use | When a class shares common behavior and structure | When you need classes to follow the same rules but implement them differently
*/
public class About {

}
