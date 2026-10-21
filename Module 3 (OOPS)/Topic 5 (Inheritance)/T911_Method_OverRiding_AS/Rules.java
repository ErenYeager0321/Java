package T911_Method_OverRiding_AS;
/*
	Rule 1-Access Specifier - Speicifiers Must be same or in Increasing order of Visibility
                              Not Accepatable In Decreasing Order
    Order - Public							
			protected						
			default(packagelevel)			
			private                        
                          
    These Are Allowed - 1. Public to Public (Parent And Child 
                        2. Protected to Public
						3. Default (Package-Private) to Protected
						4. Default to Private? NO! (Its In Dec. Order
*/
/*
   Standard Definition:
	Method overriding is when a subclass provides its own implementation of a method 
	that is already defined in its superclass. The method in the subclass must have 
	the same name, return type, and parameters as the method in the parent class.
	
	Simple Explanation:
	Think of method overriding like changing a recipe your parent gave you. 
	The original recipe is passed down to you (parent class), but you can add your 
	personal touches (child class) while keeping the main idea intact. For example, 
	if the recipe says "boil water," you might want to add some extra ingredients 
	like ginger or cardamom. The recipe stays the same in structure, but you have 
	your unique version.
	
	Why is Method Overriding Important?
	* Flexibility: It allows subclasses to have different behaviors while maintaining 
	  the same method signature.
	* Code Reusability: It helps avoid repeating code by letting the child class reuse 
	  the parent class's method but modify its functionality.
	* Extensibility: It enhances the flexibility of your program, making it easier to 
	  extend the functionality of an existing system without changing the parent class.
   
   
   Key Points to Remember:
	1. Method Overriding: A child class provides its own implementation of a parent class method
	with the same name, parameters, and return type.
	2. Same Method Name: The method in the child class must have the same name as in the
	parent class.
	3. Same Parameters: The method must have the same parameters (inputs) in both the parent
	and child classes.
	4. Access Modifiers: The visibility of the overridden method in the child class must be the same
	or more visible than in the parent class.
	5. @Override Annotation: Used to indicate method overriding and ensure the method
	signature is correct.
	6. Flexibility and Reusability: Method overriding allows child classes to customize parent class
	behavior while reusing the same method structure.
*/
class Shape {
	public double calculateArea() {
	System.out.println("Calculating area of a generic shape.");
	return 0.0;
	}
}


class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
	this.radius = radius;
	}
	@Override
	public double calculateArea() {
	return Math.PI * radius * radius;
	}
}

public class Rules{
	
}
