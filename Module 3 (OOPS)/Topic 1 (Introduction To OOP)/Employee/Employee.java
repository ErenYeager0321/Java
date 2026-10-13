package Employee;

public class Employee {
	public static void main(String[] args) {
		EmployeeDetails employee = new EmployeeDetails();
		employee.id = 102;
		employee.name = "Jessica Lee";
		employee.department = "Marketing";
		employee.yearsOfExperience = 7;

		System.out.println("Employee ID: " + employee.id);
		System.out.println("Employee Name: " + employee.name);
		System.out.println("Department: " + employee.department);
		System.out.println("Years of Experience: " + employee.yearsOfExperience);

		employee.work();
		employee.attendMeeting();
		}
}

class EmployeeDetails{
	int id;
	String name;
	String department;
	int yearsOfExperience;

	public void work() {
	System.out.println(name + " is working on office tasks.");
	}

	public void attendMeeting() {
	System.out.println(name + " is attending a meeting.");
	}
}
