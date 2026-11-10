package T4_LimitationOfParent;

/* Limitaton is that PArent Child Reference Cant access Child specialized method so we use DownCasting , 
 * but the class should be the instance of the reference 
 */

class Teacher{
	String name;
	public void markAttendance() {
		System.out.println("Teacher Is Marking Attendance");
	}
	public void teach() {
		System.out.println("Teacher Is Teaching ");
	}
}

class PhyTeacher extends Teacher{
	public PhyTeacher(String name) {
		this.name = name;
	}
	public void markAttendance() {
		System.out.println(name+"PhyTeacher Is Marking Attendance");
	}
	public void teach() {
		System.out.println(name+"PhyTeacher Is Teaching ");
	}
	public void dolawexp() {
		System.out.println("teacher Is Doing Exp");
	}
}

class ChemTeacher extends Teacher{
	public ChemTeacher(String name) {
		this.name = name;
	}
	public void markAttendance() {
		System.out.println(name+"ChemTeacher Is Marking Attendance");
	}
	public void teach() {
		System.out.println(name+"ChemTeacher Is Teaching ");
	}
	public void sleep() {// Child Specialized Method
		System.out.println("Sleeping");
	}
}

class College {
	//Also Called Flexible Method
//	public void accept(Teacher ref) {//PolyMorphism is Teacher ref 1st Method
	public static void accept(Teacher ref) {//PolyMorphism is Teacher ref , Making Static Because Gonna use this only for All Class
	ref.markAttendance();
	ref.teach();
//	ref.sleep();Cant Access Specialized use DownCasting
	
	if(ref instanceof PhyTeacher)
		((PhyTeacher) ref).dolawexp();
	if (ref instanceof ChemTeacher) // This will fix the error
		((ChemTeacher)ref).sleep();// This Will Give Error "ClassCastException"
	}
}
	
public class Limitation {
	public static void main(String[] args) {
		//3rd(Main) Final Polymorphism , Static Method
		College.accept(new PhyTeacher("Emilia"));
		College.accept(new ChemTeacher("Rem"));
	}
}
