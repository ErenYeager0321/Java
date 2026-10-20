package T5_Hierarchical_Inheritance;

/*
	Standard Definition:
	Hierarchical inheritance is a type of inheritance where two or 
	more classes inherit from the same base class.
	
	Why Is It Important? 🎯
	• It reduces code duplication when many classes share the same features.
	• It keeps your code organized and easier to manage.
	• You can define general behavior once and reuse it across 
	different subclasses.
	• It mirrors real-world systems — like multiple departments 
	in a company all reporting to the same head.
*/

class User {
	String name;
	int userId;
	public void displayUserDetails() {
	System.out.println("User ID: " + userId + ", Name: " + name);
	}
}
	
class Student extends User {
	String grade;
	
	
	public void displayStudentDetails() {
	displayUserDetails(); // inherited from User
	System.out.println("Grade: " + grade);
	}
}
	
class Teacher extends User {
	String subject;
	public void displayTeacherDetails() {
	displayUserDetails(); // inherited from User
	System.out.println("Subject: " + subject);
	}
}

public class About {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "John";
		student.userId = 101;
		student.grade = "A";
		student.displayStudentDetails();

		Teacher teacher = new Teacher();
		teacher.name = "Mr. Smith";
		teacher.userId = 201;
		teacher.subject = "Mathematics";
		teacher.displayTeacherDetails();
	}
}
