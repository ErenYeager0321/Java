package T3_Single_Inheritance;

class Person {
	String Name;
	void Introduce() {
		System.out.println("Hello My Name Is : "+Name);
	}
}

class Professor extends Person{
	String Department;
	void ConductLecture() {
		System.out.println(Name+" Is Conducting The Lecture");
	}
}

public class P1_College_management {
	public static void main(String[] args) {
		Professor Professor = new Professor();
		Professor.Name = "Subaru";
		Professor.Department = "CSIT";
		System.out.println("Professor Name : "+Professor.Name);
		System.out.println("Department : "+Professor.Department);
		Professor.Introduce();
		Professor.ConductLecture();
	}
}
