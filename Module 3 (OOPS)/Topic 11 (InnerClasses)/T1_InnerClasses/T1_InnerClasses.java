package T1_InnerClasses;
/*
	What Does Inner Class Mean?
	Empty classes: An inner class is a class defined inside another class. It's like having a helper inside your main job, ready to assist whenever needed. You don't use an inner class for everything, but it's helpful when certain things only exist in the outer class and won't be used anywhere else.
	• The boss is a doctor (outer class).
	• The doctor's dog is a pet (inner class) that helps your work (specific functionality).
	• The doctor is only there because of the dog - you don't need to put your dog anywhere else.
	
	404
	This page could not be found.
	
	Why Are Inner Classes Useful?
	• Organizing Code Better:
	Inner classes can help you keep related things together. Instead of having a bunch of random code scattered everywhere, you can put similar parts in one place. It's like putting similar clothes in the same drawer so you can find them easily.
	• Access to Outer Class Variables:
	Inner classes can easily access the variables and methods in the outer class. This means you don't have to re-enter information back and forth too much.
	• Cleaner Code:
	Inner classes help keep your code clean and easy to understand. You don't need to write separate files for everything.
	Java's "Four Types: Family, Four Types You Should Know"
	
	In Java, there are four types of inner classes, each with a special role. These classes are like members of a family, each one with a unique function. Let's take a look at each type and how they can help you organize your code.
	
	1. Member Inner Classes: The Helpful Younger Siblings
	Imagine you have a younger sibling who always helps you with your homework and knows all your secrets. This sibling doesn't live far from you; they are always close and ready to lend a hand whenever you need them.
	In less, a Member Inner Class is a class that exists inside another class. It is clearly tied to the outer class and can access all the private and public properties of the outer class.
	
	Here's an example:
	
	class College {
	String collegeName = "Best Engineering College";
	
	class Student {
		String studentName;
		
		Student(String studentName) {
		this.studentName = studentName;
		}
		
			void display() {
				System.out.println("Student Name: " + studentName + ", College Name: " + collegeName);
			}
		}
	}
	
	Explanation:
	• The Student class is the "younger sibling" inside the College class.
	• The Student class can easily access and use the collegeName variable from the outer College class, just like a sibling who knows all your family secrets.
	
	2. Static Nested Classes: The Independent Cousins
	Think of "Nostri" Nested Classes as your cousins who are part of the family but live in their own house, maybe just down the road. They belong to the family, but they don't depend on the family home for everything.
	In Java, Static Nested Classes are like members of the outer class, but they don't need an instance of the outer class to work. They are independent but can still be part of the same group.
	
	Here's an example:
	
	class Village {
		static class House {
		String houseAddress;
		
		House(String houseAddress) {
		this.houseAddress = houseAddress;
		}
	
		void display() {
			System.out.println("House Address: " + houseAddress);
			}
		}
	}
	
	Explanation:
	• The House class is a Static Nested Class inside the Village class.
	• It's independent, meaning you can create an instance of House without sending an instance of the Village class.
	• It still belongs to the Village class, but doesn't need to know about the village's details.
	
	3. Local Inner Classes: The Temporary Friends
	Local Inner Classes are classes that are defined inside a method. They are temporary and only exist during the method's execution. After the method finishes, the local class is no longer available.
	Here's an example:
	
	class Person {
	void displayMessage() {
	class LocalMessage {
	void printMessage() {
	System.out.println("This is a local message!");
	}
	}
	LocalMessage msg = new LocalMessage();
	msg.printMessage();
	}
	}
	
	Explanation:
	• The LocalMessage inner class is a local class defined inside the displayMessage() method.
	• It's temporary and only exists while the displayMessage() method is running.
	
	4. Anonymous Inner Classes: The One-Time Helpers
	Anonymous Inner Classes are classes that don't have a name. They are created and used on the fly, usually when you need to implement an interface or extend a class just once.
	Here's an example:
	interface Helper {
	void help();
	}
	
	class VillageEvent {
	void organize() {
	// Anonymous class (one-time helper)
	Helper volunteer = new Helper() {
	public void help() {
	System.out.println("Setting up for the village fair!");
	}
	};
	volunteer.help();
	}
	}
	
	Explanation:
	* The Helper interface defines the task that needs to be done (helping).
	* The Anonymous Class is created right inside the organize method. It doesn't have a name, and it's used only to perform the job (setting up for the village fair).
	* After completing the task, the anonymous class disappears, just like a one-time volunteer who helps during an event and then leaves.
	Real life Analogies:
	1. Member Inner Classes:
	A Camera App inside your phone uses the phone's camera hardware to take pictures. It can access the phone's storage, memory, and even other apps, just like how a younger sibling knows your routine and family secrets.
	2. Static Nested Classes:
	The Clock Widget that shows the time on your phone screen is a standalone feature. It's part of the phone's system but doesn't depend on the phone's personal apps, just like a Static Nested Class that can exist independently without the outer class.
	3. Local Classes:
	When you set up a new phone, a quick guide or tutorial shows you how to set up your email, contacts, or Wi-Fi. This guide only exists while you're setting things up. After the setup is complete, the guide disappears, just like a Local Class that only exists while the method is running.
	4. Anonymous Classes:
	In a video streaming app like Netflix, you might get a one-time pop-up asking you to rate a show after you finish watching it. Once you've rated it, the pop-up is gone, just like an anonymous class that appears for a specific task and then disappears.
	
	Key Points to Remember About Inner Classes in Java
	1. Definition: Inner classes are classes defined within another class. 
	They are used to logically group related functionality and make the code
	 more readable and maintainable.
	
	2. Types of Inner Classes:
	* Member Inner Classes: Regular classes inside another class, often used to represent entities related to the outer class.
	* Static Nested Classes: Similar to member inner classes but they do not need an instance of the outer class to be created.
	* Local Classes: Classes defined inside methods, useful for temporary tasks.
	* Anonymous Classes: Classes created on-the-fly, used only once, typically for implementing interfaces or overriding methods.
	
	3. Advantages:
	* Encapsulation: Keeps related code together and hides implementation details.
	* Access: Inner classes have access to all the members (including private ones) of the outer class.
	* Convenience: They help organize code in a more readable and logical manner.
*/
public class T1_InnerClasses {

}
