package T1_With_Inheritance;

/*	Inheritance is the process of acquiring the properties(variables and methods)
	from parent to child classes.

	Standard Definition:
	Inheritance is a fundamental concept in object-oriented programming
	where one class (called the subclass or child class) acquires the 
	properties and behaviors (fields and methods) of another 
	class (called the superclass or parent class).
	
	Why Is It Important? 🎯
	When your program starts to grow, repeated code becomes hard to manage. 
	Inheritance helps avoid that. It makes your code cleaner and easier 
	to maintain. If something common changes (like a hobby), you only need 
	to update it in one place.

*/
//Parent class
	class Player {
	String hobby = "sports";
	public void play() {
	System.out.println("Play sports!");
	}
	}
	
	//Child class
	class Cricketer extends Player {
	//Inherits everything from Player
	}
	
	//Child class
	class Footballer extends Player {
	//Inherits everything from Player
	}
	
	public class About {
		public static void main(String[] args) {
			Cricketer c = new Cricketer();
			System.out.println("Cricketer's hobby: " + c.hobby);
			c.play();
	
			Footballer f = new Footballer();
			System.out.println("Footballer's hobby: " + f.hobby);
			f.play();
	}
}