package T4_Student_Management;

public class Student {
	String studentName;
	int rollNumber;
	String course;

	public Student(String name, int rollNo, String courseName) {
	studentName = name;
	rollNumber = rollNo;
	course = courseName;
	}

	public void displayDetails() {
	System.out.println("Student Name: " + studentName);
	System.out.println("Roll Number: " + rollNumber);
	System.out.println("Course: " + course);
	}
}
