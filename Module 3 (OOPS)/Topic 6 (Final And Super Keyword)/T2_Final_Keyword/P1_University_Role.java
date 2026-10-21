package T2_Final_Keyword;

class Person {
	int id;
	public final void showID() {
		System.out.println("My ID is " + id + ".");
	}
}

class Professor extends Person {
	public void conductLecture() {
		System.out.println("Professor is conducting a lecture.");
	}
}

class Student extends Person {
	public void attendLecture() {
	System.out.println("Student is attending a lecture.");
	}
}

class ResearchAssistant extends Student {
	public void conductLecture() {
		System.out.println("RS is conducting a lecture as a research assistant.");
	}
}

public class P1_University_Role {
	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.id = 1;
		professor.conductLecture();
		professor.showID();
		Student student = new Student();
		student.id = 2;
		student.attendLecture();
		student.showID();
		ResearchAssistant ra = new ResearchAssistant();
		ra.id = 3;
		ra.attendLecture();
		ra.conductLecture();
		ra.showID();
		}
}
