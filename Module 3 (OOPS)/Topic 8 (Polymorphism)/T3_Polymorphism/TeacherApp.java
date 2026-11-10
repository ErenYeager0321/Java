package T3_Polymorphism;

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
}

class College {
	//Also Called Flexible Method
//	public void accept(Teacher ref) {//PolyMorphism is Teacher ref 1st Method
	public static void accept(Teacher ref) {//PolyMorphism is Teacher ref , Making Static Because Gonna use this only for All Class
	ref.markAttendance();
	ref.teach();
	}
}

public class TeacherApp {
	public static void main(String[] args) {
		//3rd(Main) Final Polymorphism , Static Method
		College.accept(new PhyTeacher("Emilia"));
		College.accept(new ChemTeacher("Rem"));
		
	/*  2nd Without Static Method , It Has PM But Without Compactness And Flexibility
	    College c = new College();
		PhyTeacher Pt = new PhyTeacher("Emilia");
		c.accept(Pt);//PolyMorphism
		ChemTeacher Ct = new ChemTeacher("Rem");
		c.accept(Ct);//PolyMorphism
	*/
		
		
/*		1st
  		Teacher ref;
		PhyTeacher Pt = new PhyTeacher("Emilia");
		ref = Pt;
		ref.markAttendance();
		ref.teach();
		 
		
		ChemTeacher Ct = new ChemTeacher("Rem");
		ref = Ct;
		ref.markAttendance();
		ref.teach();
	 	Here .MarkAttendance is having Plymorphism 1 to Many[1:M]
		*/
	}
}
