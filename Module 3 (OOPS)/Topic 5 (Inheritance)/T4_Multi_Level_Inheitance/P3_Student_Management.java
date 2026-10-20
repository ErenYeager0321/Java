package T4_Multi_Level_Inheitance;

class Person {
	String name;
	int age;
	void display() {
	System.out.println("Name: " + name + ", " + "Age: " + age);
	}
}

class Student extends Person {
	String studentID;
	void display() {
	System.out.println("Name: " + name + ", " + "Age: " + age + ", " + "Student ID: " + studentID);
	}
}

class GraduateStudent extends Student {
	int graduationYear;
	void display() {
	System.out.println("Name: " + name + ", " + "Age: " + age + ", " + "Student ID: " + studentID + ", " + "Graduation Year: " + graduationYear);
	}
}

public class P3_Student_Management {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "John";
		person.age = 50;
		
		Student student = new Student();
		student.name = "Alice";
		student.age = 22;
		student.studentID = "S12345";
		
		GraduateStudent gs = new GraduateStudent();
		gs.name = "Bob";
		gs.age = 24;
		gs.studentID = "G12345";
		gs.graduationYear = 2023;
		
		person.display();
		student.display();
		gs.display();
		}
}
