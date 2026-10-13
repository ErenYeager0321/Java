package T3_Employee_Management;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee e1 = new Employee("John Doe", 101, "HR");
		Employee e2 = new Employee("Jane Smith", 102, "Finance");
		Employee e3 = new Employee("Alice Johnson", 103, "IT");

		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
	}
}
