package Encapsulation;

public class Student {
	private int id ;
	private String name;
	private int marks;
	
	static int defaultid=0;
	static String defaultname;
	static int defaultmarks=35;
	
	//ID SETTER
	public void setid(int x) {
		if(x>0)//Positive value hogi tab hi lenge 
		id = x;
		else
		id = ++defaultid;
	}
	//GETTER
	public int getid() {
		return id;
	}
	
	//Name SETTER
	public void setName(String y) {
//		if()//Positive value hogi tab hi lenge 
		name = y;
//		else
//		Stirng = defaultname;
	}
	//GETTER
	public String getName() {
		return name;
	}
	
	//Marks
	public void setmarks(int z) {
		if(z>35)//Positive value hogi tab hi lenge 
		marks = z;
		else
		marks = ++defaultmarks;
	}

	//GETTER
	public int getmarks() {
		return marks;
	}
	
}
