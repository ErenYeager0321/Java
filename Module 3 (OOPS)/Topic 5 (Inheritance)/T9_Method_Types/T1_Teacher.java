package T9_Method_Types;

class Teacher {
	String name;
	void MarkAttendance() { // Child Specific Behaviour Bcz Inka Parent Object Hai
		System.out.println(name + " Teacher is MArking Attendace");
	}
	void Teach() { // Child Specific Behaviour
		System.out.println(name + " Teacher is teaching");
	}
}

class JavaTeacher extends Teacher{
	
	public JavaTeacher(String name) { //Inherited Behaviour (inherits Name)
	   this.name =  name;
	}
	
	/* *Method OverRiding - Process Of Inheriting From Parent And Changing the 
	 Implementation According to the child needs */
	
	void Teach() {//Over Ridden Behaviour
		System.out.println(name + " Teacher Is Teaching Java");
	}
	
	void LearnJava() { // Child Specific Behaviour
		System.out.println("Child Studies Java");
	}
}

public class T1_Teacher{
	public static void main(String[] args) {
		JavaTeacher pt =  new JavaTeacher("Punith");
//		pt.name = "PhyTeacher";
		pt.MarkAttendance();
		pt.Teach();
		pt.LearnJava();
	}
}