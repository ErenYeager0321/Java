package Static_3Method;

class School {
	// Non-static variable for tracking class-specific details
	String className;
	
	// Static method for general school notifications
	public static void sendGeneralNotification() {
		System.out.println("Reminder: School will be closed on Friday for maintenance.");
	}
	
	// Non-static method for sending notifications specific to the class
	public void sendClassNotification() {
		System.out.println("Attention " + className + " students: Your class has to conduct morning assembly this week.");
	}
}

public class ClassRoom1 {
	public static void main(String[] args) {
		// Calling static method without creating an object
		School.sendGeneralNotification();
		
		// Creating object for Class 101 and sending class-specific message
		School class101 = new School();
		class101.className = "Class 101";
		class101.sendClassNotification();
		
		// Creating object for Class 102 and sending class-specific message
		School class102 = new School();
		class102.className = "Class 102";
		class102.sendClassNotification();
	}
}

