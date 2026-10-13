package Encapsulation;

public class StudentApp {
	public static void main(String[] args) {
		Student s = new Student();
		s.setid(100);
		System.out.println(s.getid());
		
		s.setName("Subaru");
		System.out.println(s.getName());
		
		s.setmarks(34);
		System.out.println(s.getmarks());
	}
}
