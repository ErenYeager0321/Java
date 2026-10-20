package T8_Copy_Constructor;

public class Student {
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public Student(){
		
	}
	
	// Copy Constructor jisme bhi parameter same name as class ho wo CC hoga
	public Student(Student ref) {
		this.id = ref.id;
		this.name = ref.name;
		this.marks = ref.marks;
	}
	
	//Getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
