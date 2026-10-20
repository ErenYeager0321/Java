package T5_Hierarchical_Inheritance;

class Person{
	String name;
	void Introduce() {
		System.out.println("Hello, My Name Is : "+name);
	}
}

class Student1 extends Person{
	String Major;
	void AttendLecture() {
		System.out.println(name+"is Attending A Lecture");
	}
}
class Professor extends Person{
	String Department;
	void ConductLecture() {
		System.out.println(name +" Is Conducting A lecture");
	}
}

public class P1_University_Role {
	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.name = "Sachin Murarika";
		professor.Department = "Computer Science";
		System.out.println("Professor Name: " + professor.name);
		System.out.println("Department: " + professor.Department);
		professor.Introduce();
		professor.ConductLecture();
		
		Student1 student = new Student1();
		student.name = "Priya Sharma";
		student.Major = "Computer Science";
		System.out.println("Student Name: " + student.name);
		System.out.println("Major: " + student.Major);
		student.Introduce();
		student.AttendLecture();
	}
}

