package T1_Has_A_Realtionship;
/*
  	Has a relationship Has 2 types
  	1.Loose Bound Relationship(Aggregation)
  	2.Tight Bound Relationship(Comosition)
  
	What Exactly is the HAS-A Relationship?
	Standard Definition:
	In object-oriented programming (OOP), the HAS-A relationship refers to 
	the situation where one class contains objects of another class.
	
	Simple Explanation:
	Now you have a Car. A car has an engine. In Java, this means the Car 
	class does not inherit from the Engine class, but it has an Engine 
	object inside it. This is called a HAS-A relationship. It simply 
	means one class has another class as a part of it. Just like in real life, 
	a car is made up of different parts like an engine, wheels, and seats. 
	The engine is not the car itself, but it is an important part of the car. 
	In the same way, in Java, we put one object inside another class to 
	show that it is part of it.
	
	Why is the HAS-A Relationship Important?
	• Encapsulation: The HAS-A relationship allows the internal details 
	  of a class to be hidden from the outside world.
	• Modularity: Using the HAS-A relationship, we can build larger systems 
	  by composing smaller, independent parts.
	• Reusability: The component objects can be reused across different classes.
	• Flexibility: We can modify the contained objects without affecting the rest of the class.

	Types of HAS-A Relationships:
	There are two main types of HAS-A relationships in Java:
	1. Aggregation (The "Friends with Benefits" of Object Relationships)
	2. Composition (The "Till Death Do Us Part" of Object Connections)
	
	Aggregation
	Aggregation is a type of HAS-A relationship where the contained object 
	can exist independently of the container object. This represents a weak 
	relationship between the objects.
	
	Real-World Example of Aggregation:
	Imagine a university and its professors. The university employs many 
	professors, but each professor can also work at another university or 
	leave and still continue teaching elsewhere. So, even if the university 
	shuts down, the professors can still exist independently.
	* A University HAS-A Professor.
	* Professors can exist independently of the University.
	
	Characteristics of Aggregation:
	* Dependency: The part (contained object) can exist without the whole (container object).
	* Lifespan: The part's lifespan is not dependent on the whole.
	Aggregation is like two roommates sharing a house. They live together, 
	but each can move out and live elsewhere without any problem. 
	They are connected, but not dependent on each other.
	
	Composition
	Composition is a stronger type of HAS-A relationship where the contained 
	object cannot exist independently of the container object. 
	This represents a strong relationship between the objects, 
	indicating a whole-part relationship.
	
	Real-World Example of Composition:
	Think about a house and its rooms. A house is composed of various rooms 
	like the living room, bedroom, kitchen, and bathroom. 
	These rooms cannot exist independently without the house. 
	If the house is demolished, the rooms cease to exist as separate entities.
	* House has multiple Rooms.
	* Rooms cannot exist independently of the House.
	Characteristics of Composition:
	* Dependency: The part (contained object) cannot exist without the whole (container object).
	* Lifespan: The part's lifespan is directly tied to the whole.
	Now, composition is the ride-or-die of object relationships. These objects are so tight, 
	they can't exist without each other. It's all for one and one for all!
*/
public class About {

}
