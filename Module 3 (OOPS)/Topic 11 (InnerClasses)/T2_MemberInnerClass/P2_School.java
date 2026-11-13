package T2_MemberInnerClass;

class School1 {
	private String name;
	
	public School1(String name) {
	this.name = name;
	}

	class Classroom {
		private int roomNumber;
		private String subject;
	
		public Classroom(int roomNumber, String subject) {
		this.roomNumber = roomNumber;
		this.subject = subject;
		}
	
		public void displayInfo() {
		System.out.println(name + " - Room " + roomNumber + ": " + subject + " class");
		}
	}
}

public class P2_School {
	public static void main(String[] args) {
		School1 s = new School1("Haggu School");
		School1.Classroom c = s.new Classroom(80 , "Math");
		c.displayInfo();
	
	}
}
