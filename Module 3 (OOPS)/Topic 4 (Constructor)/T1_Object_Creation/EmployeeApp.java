package T1_Object_Creation;

public class EmployeeApp {
	public static void main(String[] args) {
		Employe e = new Employe(10 , "Subaru" , 25000);//Thats A Constructor Call
		//e.setData(10, "Subaru", 25000);
		System.out.println("ID : " + e.getid() + " Name : " + e.getName() + " Salary : " + e.getSalary());
	}
}
