package T4_Multi_Level_Inheitance;

/*
	Simple Explanation:
	Multilevel inheritance is when a class inherits from a class, which itself inherits from another class. It
	forms a chain of inheritance.
	
	Standard Definition:
	Multilevel inheritance is a type of inheritance where a class 
	derives from a child class, which in turn derives from another 
	parent class. This allows properties and methods to be passed 
	through multiple levels.
	
	Why Is It Important? ♀️
	Here's why multilevel inheritance is helpful:
	• You can keep general features at the top and special features lower in the hierarchy.
	• You avoid repeating the same code in every class.
	• You keep your code organized and readable.
	• You can update shared features in one place, and all related classes benefit from it.
*/

class Animal{
	String name ;
	void eat() {
		System.out.println(name +" Is Eating");
	}
	void display() {
		System.out.println(name +" Executed");
	}
}

class Tiger extends Animal{
	void display() {
		System.out.println("Tiger Executed");
	}
}

class Bengaltiger extends Tiger{
	
	void display() {
		System.out.println("BengalTiger Executed");
	}
}



public class About {
		public static void main(String[] args) {
			Bengaltiger Bt = new Bengaltiger();
			Bt.name = "BengalTiger";
			Bt.eat();
			Bt.display();
			
			Tiger tiger = new Tiger();
			tiger.name = "Tiger";
			tiger.eat();
			tiger.display();
			
			Animal animal = new Animal();
			animal.name = "Animal";
			animal.eat();
			animal.display();
			
		}
}
