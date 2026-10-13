package Student_Info;

public class StudentApp {
	public static void main(String[] args) {
		Student student1 = new Student();
		
		student1.setData(80, "Subaru" , 20);
		System.out.println("Final Student Details:");
		System.out.println("Roll Number: " + student1.getRollNumber());
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		
		student1.setRollNumber(101);
		student1.setName("Alice");
		student1.setAge(20);

		System.out.println("Initial Student Details:");
		System.out.println("Roll Number: " + student1.getRollNumber());
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());

		student1.setName("Alicia");
		student1.setAge(-5);
		student1.setAge(21);

		System.out.println("Final Student Details:");
		System.out.println("Roll Number: " + student1.getRollNumber());
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		
		
		
	}
}
