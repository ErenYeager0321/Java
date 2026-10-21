package T913_Methiod_OverRiding_RetrunType;

/*
	What Exactly is Method Overriding with Return Types?
	Method overriding with return types is when a child class provides 
	its own implementation of a method that exists in the parent class 
	but with a different return type. In Java, this is allowed as long 
	as the return type is compatible with the parent class's method.
	
	Simple Explanation with Example:
	Think of it like a recipe for making chai. Your parent class might 
	provide a basic recipe that says, "Make tea and serve it in a cup.
	" The child class, say, "I'll add spices and serve it in a thermos." 
	Both methods share the same idea (making tea), but they each give a 
	different result or return type-one in a cup, the other in a thermos.
	
	Why is Method Overriding with Return Types Important?
	* Flexibility in Return Types: It allows child classes to define a more 
	  specific return type based on their needs while still overriding the 
	  parent method.
	* Code Reusability: You can use the same method name in multiple 
	  subclasses while each subclass returns a suitable result based on 
	  its specific data type.
	* Maintaining Consistency: Overriding methods with compatible return 
	 types keeps your code cleaner, reduces redundancy, and maintains 
	 logical consistency.
	* Real-World Example: When you're shopping online, an app might return 
	  different price details for each product type-electronics, clothes, 
	  and groceries. Even though all return prices, the format might differ 
	  based on the item.
	
	Understanding the rules about return types:
	When you override a method, there are some rules you need to follow 
	about return types:
	1. Return Type Compatibility:
	The return type of the overridden method in the child class should be 
	a subtype or the same as the return type in the parent class. 
	For example, you can override a method that returns Object with 
	a more specific return type like String.
	
	2. Covariant Return Types:
	Java allows covariant return types, where the child class method can 
	return a more specific type than the parent class method.
	Matlab Child class ek dusre Child Class ka return type use kr skta hai aur Parent Parent ka Return type 
	
*/

/*
	  Example 1: Same Return Type
	• Parent class method returns a String.
	• Child class method must also return a String.
*/	

class StreetFood {
	public String makeSnack() {
		System.out.println("StreetFood Executed");
	return "Plain Samosa";
	}
}
	
class SpicyStreetFood extends StreetFood {
	@Override
	public String makeSnack() {
		System.out.println("SpicyStreetFood Executed");
	return "Spicy Samosa with Chutney and Chaat Masala"; // Same return type (String)
	}
}

/*
	  Example 2: Covariant Return Types
	* Parent class method returns a Food object.
	* Child class method can return a Samosa object (a subtype of Food).
	  Matlab Child class ek dusre Child Class ka return type use kr skta hai 
	  aur Parent Parent ka Return type 
	
*/

class Food {
// Some properties and methods
}
class Samosa extends Food {
// Some properties and methods
}

class StreetFood1 {
	public Food makeSnack() {
		System.out.println("StreetFood1 Executed");
	return new Food();
	}
}

class SpicyStreetFood1 extends StreetFood1 {
	@Override
	public Samosa makeSnack() { // Covariant return type (Samosa is a subtype of Food)
	System.out.println("SpicyStreetFood1 Executed");
		return new Samosa();
	}
}

public class Ruless {
	public static void main(String[] args) {
		SpicyStreetFood1 ssf1 = new SpicyStreetFood1();
		ssf1.makeSnack();
		
		SpicyStreetFood ssf = new SpicyStreetFood();
		ssf.makeSnack();

	}
}
