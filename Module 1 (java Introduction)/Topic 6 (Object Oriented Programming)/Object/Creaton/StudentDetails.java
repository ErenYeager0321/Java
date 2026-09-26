package Object.Creaton;

public class StudentDetails {
	public static void main(String[] args) {
	Student s1 = new Student(); 
	Student s2 = new Student(); 
	
	s1.id=123;
	s1.name="Subaru";
	s1.marks=99;
	
	s2.id=123;
	s2.name="Subaru";
	s2.marks=99;
	
	s1.eat();
	s1.sleep();
	s1.study();
	s2.eat();
	s2.sleep();
	s2.study();
	
	
	
	}
}
