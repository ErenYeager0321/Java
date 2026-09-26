package TakingUserInput;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee(); 
		
		System.out.println("Enter id , Name , Salary");
		emp.id = sc.nextInt();
		emp.name = sc.next();
		emp.salary = sc.nextInt();
		System.out.println(emp.id+" "+emp.name+" "+emp.salary );
	}
}
