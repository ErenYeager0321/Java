package T4_Student_Management;

public class StudentApp {
	public static void main(String[] args) {
		Student student1 = new Student("Alice Brown", 201, "Mathematics");
		Student student2 = new Student("Bob Green", 202, "Physics");
		Student student3 = new Student("Charlie Black", 203, "Chemistry");

		student1.displayDetails();
		student2.displayDetails();
		student3.displayDetails();
	}
}
