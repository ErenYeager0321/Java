package T2_MemberInnerClass;
/*
What Are Member Inner Classes?
A Member Inner Class is a class that is defined inside another class. It is like a helper class that works closely with the outer class and has access to all the variables and methods of the outer class, even private ones. You can think of a Member Inner Class as a younger sibling who always helps you with tasks and knows all your secrets.

How to Create a Member Inner Class?
To create a Member Inner Class, you simply define the inner class inside the outer class. Here's the basic structure:
1. Create an outer class.
2. Inside the outer class, create the inner class.
3. You can create objects of the inner class inside the outer class and use them just like normal classes.
Example:
Let's look at an example to understand how to create and use a Member Inner Class:

How This Code Works:
1. Outer Class (School): This class represents a school. It has a private variable schoolName which holds the name of the school.
2. Inner Class (Student): This class is defined inside the School class. The Student class can access the schoolName variable from the outer class because it is a member of the outer class. It also has a method introduce() to introduce itself with the school name.
3. Method to Use the Inner Class: Inside the School class, we have a method showStudentInfo(). This method creates an object of the inner class Student and calls its introduce() method.
4. In the Main class, we create an object of the outer class School and use the method showStudentInfo() to display information about the student.
*/

//Outer class
class School {
	private String schoolName = "Greenwood High School";

	// Member Inner Class
	class Student {
		void introduce() {
		// The inner class (Student) can access the outer class's private variable
		System.out.println("I study at " + schoolName);
	}
}
//	Student student;//For Calling from Main Method 2nd Method its not needed
	
	// Method to use the inner class
	void showStudentInfo() {
	// Creating an instance of the inner class (Student)
	Student student = new Student();// we Can call inner class like that too , and also inside the mainn method
	student.introduce(); // Calling the method of the inner class
	}
}

public class T1_MemberInnerClass {
	public static void main(String[] args) {
		// Creating an instance of the outer class (School)
		School school = new School();
		
		School.Student st = school.new Student();// Can call like that too
		st.introduce();
//		school.student = st; this also not needed
		
		// Using the method of the outer class to create and use the inner class
		school.showStudentInfo();
		}
}


