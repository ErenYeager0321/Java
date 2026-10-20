package T7_Super_Constructor_Chaining;

class Employee {
	String name;
	int id;
	String department;
	
	public Employee(String name, int id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}
}
	
class Manager extends Employee {
	int teamSize;
	public Manager(String name, int id, String department, int teamSize) {
		super(name, id, department);
		this.teamSize = teamSize;
	}
	public void displayDetails() {
		System.out.println("Manager Name: " + name);
		System.out.println("Employee ID: " + id);
		System.out.println("Department: " + department);
		System.out.println("Team Size: " + teamSize);
	}
}
	
class Developer extends Employee {
	String programmingLanguage;
	public Developer(String name, int id, String department, String programmingLanguage) {
		super(name, id, department);
		this.programmingLanguage = programmingLanguage;
	}
	public void displayDetails() {
		System.out.println("Developer Name: " + name);
		System.out.println("Employee ID: " + id);
		System.out.println("Department: " + department);
		System.out.println("Programming Language: " + programmingLanguage);
	}
}

public class T4_Employee_Management {
	public static void main(String[] args) {
		Manager myManager = new Manager("John Doe", 101, "Finance", 5);
		Developer myDeveloper = new Developer("Alice Johnson", 102, "IT", "Java");
		
		myManager.displayDetails();
		myDeveloper.displayDetails();
		}
}
