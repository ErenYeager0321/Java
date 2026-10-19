package T3_Single_Inheritance;

class Human {
	 // Declare name and age attributes
	String Name;
	int Age;
	 // Method to display name and age
	void display() {
		System.out.println(" Name: " + Name + ","+ " Age: " + Age);
	}
}
class Student1 extends Human{
	// Declare name and age attributes
	String StudentID;
	// Method to display Name , Age and Id
	void display() {
		System.out.println(" Name: " + Name + ","+ " Age: " + Age+" StudentID: " + StudentID );
	}
}


public class Student {
	public static void main(String[] args) {
		Human person = new Human();
		person.Name = "John";
		person.Age = 30;
		person.display();
		Student1 student = new Student1();
		student.Name = "Alice";
		student.Age = 20;
		student.StudentID = "S12345";
		student.display();
	}
}
