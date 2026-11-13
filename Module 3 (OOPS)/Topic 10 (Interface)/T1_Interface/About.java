package T1_Interface;
/*
	What actually Interface is ?
	 
	*So interface is used to achieve *pure abstraction, it is
	used to achieve *standardization and you cannot create
	the object of interface.
	
	*Types IMP 
    *An Interface which Contains Only 1 Abstract Method is Known As Functional Interface
	*Interface Contains Only Abstract Methods.
	*An Interface Which is empty is called Tagged / Marker /
	 Indicator interface .
	
	*Implements means giving the body to methods of an intetrface , if we 
	 wont give the body then these class methods will also behave like the 
	 abstract method and we wocnt be ableto crate the object of these.
	 
	IMP Points To Remember
	*InterFace is basically a Abstract Class And Method , Speically used for 
	abstraction.
	
	*a interface can be implemented by Classes , Also A classs can 
	 implement Multiple Interfaces.
	 
	* <<Demo>>
	void display();
	void sample();
		
	abstract Demo1  Here if a class implement(Partially Implement) only 1 method it will become Abstract
	void display(){}
	
 * A Interface can not *Implement another interface bcz it can not have any body/definition.
 * A class cannot extend(Inheritance) an interface , it will always implement.
 * But A Interface  Can *Extend(Inherit) another Interface also Multiple Innterfaces too,  And class can also implement them.
	
 * A Class Can Extend Another Class And can Impllement an Interface too Like This 
	  public class Sample3 extends Sample2 implements Sample1 , Extending must be perform first otherwise it will give error.
 * Interface Can Be USed to Achieve Multiple Inheritace.
	
	Standard definition:
	An Interface in Java programming language is defined as an abstract type used
	to specify the behaviour of a class. An interface in Java is a blueprint of a
	behaviour(method). A Java interface contains static constants and abstract
	methods.
	
	Simple Explanation:
	Imagine you're building smart home devices like lights, fans, and air conditioners. They
	all need to follow basic rules like turning on and turning off, but each device does it in
	its own way. A light might turn on with a button, an air conditioner with a remote, and a
	fan with a voice command. An interface helps by making all devices follow the same
	rules, but letting them decide how to do it.
	
	Why are Interfaces Important?
	• Flexibility: Interfaces allow each class to follow the same rules but implement them
	  in their own way.
	• Multiple Implementations: A class can follow multiple interfaces, giving it more
	  freedom.
	• No Restrictions: Unlike abstract classes, interfaces don't tell you how to do things;
	  they just tell you what to do.
*/
public class About {

}
