package Student_Info;

class Student {
	private int rollNumber;
	private String name;
	private int age;
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	//SETTER can take Setter In One but cant make Getter in one
	public void setData(int rollN , String n , int a) {
		rollNumber = rollN;
		name = n;
		if (a > 0) {
			age = a;
		} else {
			System.out.println("Invalid age. Age must be positive.");
			}
	}
	
	public void setRollNumber(int rollN) {
		rollNumber = rollN;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		if (a > 0) {
			age = a;
		} else {
			System.out.println("Invalid age. Age must be positive.");
			}
	}
	
}
