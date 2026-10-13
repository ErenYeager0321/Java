package T3_Employee_Management;

public class Employee {
	String empName;
	int empId;
	String empDepartment;

	public Employee(String name, int id, String department) {
	empName = name;
	empId = id;
	empDepartment = department;
	}

	public void displayDetails() {
	System.out.println("Employee Name: " + empName);
	System.out.println("Employee ID: " + empId);
	System.out.println("Department: " + empDepartment);
	}
}
