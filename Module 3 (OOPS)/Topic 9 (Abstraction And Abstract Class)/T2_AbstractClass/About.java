package T2_AbstractClass;
/*
Standard Definition:
An abstract class is a class that cannot be instantiated (you cannot create objects directly from it). It is used as a base class for other classes. It allows you to define common features and behaviors that must be shared by all classes that extend it.

Simple Explanation:
Think of an abstract class like a basic plan or a starting point. Imagine you want to design different kinds of cars. Instead of designing every single part (like the wheels, engine, and seats) from scratch for each car, you create a general plan that all cars must follow. Then, each specific car model (like a sports car or a family car) can add its own details based on that plan.
In simple terms, the abstract class is like a rough outline, and the specific cars can add their unique features later.

Why is an Abstract Class Important?

1. Keeps Things Organized: It helps group common features in one place while allowing specific details to be added later.
2. Prevents Redundancy: You don't have to repeat the same code for every type of vehicle. You define the common behavior in the abstract class and let the specific vehicles implement their unique behavior.
3. Provides Flexibility: Abstract classes help in creating a flexible system where new types of vehicles can be added later with minimal changes to the existing code.
*/

abstract class Mentor {
	public void trainInterns() {
		System.out.println("train interns on something...");
	}
	public void takeAttendance() {
		System.out.println("take attendance of interns...");
	}
}

class JavaMentor extends Mentor {
	public void trainInterns() {
		System.out.println("train interns on Java...");
	}
	public void takeAttendance() {
		System.out.println("take Java session attendance of interns...");
	}
}

class SqlMentor extends Mentor {
	public void trainInterns() {
		System.out.println("train interns on SQL...");
	}
	public void takeAttendance() {
		System.out.println("take SQL session attendance of interns...");
	}
}

public class About {
	public static void main(String[] args) {
	JavaMentor ji = new JavaMentor();
	SqlMentor si = new SqlMentor();
	
	startSession(ji);
	startSession(si);
}

public static void startSession(Mentor men) {
	men.trainInterns();
	men.takeAttendance();
	}
}
