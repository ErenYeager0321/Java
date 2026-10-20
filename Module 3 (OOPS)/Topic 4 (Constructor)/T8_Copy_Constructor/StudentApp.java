package T8_Copy_Constructor;

public class StudentApp {
	public static void main(String[] args) {
		Student OrgObj = new Student(80 , "Subaru" , 99);
		System.out.println(OrgObj.id+" "+OrgObj.name+" "+OrgObj.marks);
		
	/*	Student CopyCons = new Student();
		CopyCons.id = OrgObj.id;
		CopyCons.name = OrgObj.name;
		CopyCons.marks = OrgObj.marks;
		this will increase time and space complexity bcz Agar bahut saare variable honge to saaro ko call krna pdega
		System.out.println(CopyCons.id+" "+CopyCons.name+" "+CopyCons.marks);
	*/
	    Student Copy2 = new Student(OrgObj);
	    System.out.println(Copy2.id+" "+Copy2.name+" "+Copy2.marks);
		
	}
}
