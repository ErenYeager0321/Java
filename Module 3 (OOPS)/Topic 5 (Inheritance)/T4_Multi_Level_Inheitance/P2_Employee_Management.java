package T4_Multi_Level_Inheitance;


class Person1{
	int id;
	String name;
	void introduce() {
	System.out.println("Hello, my name is " + name + ".");
	}
}

class Employee1 extends Person1{
	String Department;
	void work() {
		System.out.println(name +" Is Working");
	}
}

class Manager1 extends Employee1{
	int teamsize;
	void ConductMeeting() {
		System.out.println(name +" Is Conducting a Meeting");
	}
}

public class P2_Employee_Management {
	public static void main(String[] args) {
		Manager1 Manager = new Manager1();
		Manager.id = 80;
		Manager.name = "Subaru";
		Manager.teamsize = 40;
		Manager.Department = "CSE";
		System.out.println("Manager ID: " + Manager.id);
		System.out.println("Manager Name: " + Manager.name);
		System.out.println("Department: " + Manager.Department);
		System.out.println("Team Size: " + Manager.teamsize);
		Manager.introduce();
		Manager.work();
		Manager.ConductMeeting();
	}
}
