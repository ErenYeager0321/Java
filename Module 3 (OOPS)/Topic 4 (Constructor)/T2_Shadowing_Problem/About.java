package T2_Shadowing_Problem;

public class About {
/*	class Car {
	    String color;
	    String model;

	    public Car(String color, String model) {
	        // These lines don't work as expected
	        color = color;
	        model = model;
	    }
	} 
	And we try to use it like this:

	public class Dealership {
	    public static void main(String[] args) {
	        Car myCar = new Car("Blue", "Honda Civic");
	        System.out.println("Car details: " + myCar.color + " " + myCar.model);
	    }
	}
	What We Expect:

	Car details: Blue Honda Civic
	What We Get:

	Car details: null null
	Wait... why is the output showing null for both color and model?

	What’s Happening Here? 🔍

	In the Car constructor, we wrote:

	color = color;
	model = model;
	This does not update the instance variables color and model. Instead, the parameters (color and model) refer to themselves — because they have the same name as the instance variables.
*/
	
	/*
	 * class Car {
    String color;
    String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }
}
	Now when we create the car:
	
	Car myCar = new Car("Blue", "Honda Civic");
	System.out.println("Car Details: " + myCar.color + " " + myCar.model); 
	Output:
	
	Car Details: Blue Honda Civic
	Perfect! 😄 The values were assigned correctly, and there’s no confusion now.
	
	How Does this Work?
	
	When we write:
	
	this.color = color;
	this.color means “the color variable of this object (the class variable)”
	
	color (without this) refers to the parameter passed to the constructor
	
	So we are clearly saying:
	“Take the value from the parameter and assign it to the object’s color.”
	
	This removes all confusion and ensures your object is created correctly.
	
	Why Is this Keyword So Important?
	
	Let’s understand why the this keyword matters:
	
	It solves the shadowing problem when variable names are the same
	
	It helps Java know which variable you’re referring to
	
	It makes your code clearer and safer
	
	It works not only in constructors, but also in methods
	
	It’s a standard practice in professional Java coding
	
	Without this, you might assign values to the wrong variable — or worse, not assign them at all.
	 * 
	 */
}
