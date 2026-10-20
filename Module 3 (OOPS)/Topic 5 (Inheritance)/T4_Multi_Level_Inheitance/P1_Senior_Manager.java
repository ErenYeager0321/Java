package T4_Multi_Level_Inheitance;

class Employee {
	String name;
	int employeeId;
	
	public void displayEmployeeDetails() {
		System.out.println("Employee ID: " + employeeId + ", Name: " + name);
	}
}
	
class Manager extends Employee {
	int teamSize;
	public void displayManagerDetails() {
		displayEmployeeDetails(); // Calling method from Employee class
		System.out.println("Manages team of size: " + teamSize);
	}
}

class SeniorManager extends Manager {
	String project;

	public void displaySeniorManagerDetails() {
		displayManagerDetails(); // Calling method from Manager class
		System.out.println("Project: " + project);
	}
}

public class P1_Senior_Manager {
	public static void main(String[] args) {
		SeniorManager Sm = new SeniorManager();
		Sm.employeeId = 80;
		Sm.name = "Subaru";
		Sm.project = "Project Hail Mery";
		Sm.teamSize = 10;
		Sm.displaySeniorManagerDetails();
	}
}
