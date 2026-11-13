package T1_InnerClasses;

public class Student {
	int id ;
	String name;
	int age;
	
	// Member Inner Class
	class Address {
		int doorNo;
		String StreetName;
		String landMark;
		String city;
		String state;
		int pincode;
		
		void displayAddress() {
			System.out.println("Address : " +doorNo+ " " +StreetName+ " " + landMark+" "+city+" "+state+" "+pincode);
		}
	}
	Address address;

	// Static inner Class 
	static class Marks{
		int m1;
		int m2;
		int percentage;

		void printMarks() {
		System.out.println("MARKS DETAILS : marks1 "+m1+" marks2 "+m2+" Percentage "+percentage);
		}
	}
	Marks marks;	
	
	//Local Inner Class implements inside the method also have to make the obj inside the method
	void displayphone(){
		class number{
			long primary;
			long whatsapp;
			void display() {
				System.out.println("Primary No. "+primary+" Whatsapp No. "+ whatsapp);
			}
		}
		
		number n = new number();
		n.primary = 6263392544l;
		n.whatsapp = 6263392544l;
		n.display();
	}
	
	void displayStudentDeatils() {
		System.out.println("ID : "+id+" NAME: "+name+" AGE : "+age);
		address.displayAddress();
		marks.printMarks();
		displayphone(); // we can execute these methods in mainmethod too
		//s.displayphone();
	}
}

class StudentApp{
	public static void main(String[] args) {
		   Student s = new Student();
		   s.id = 12;
		   s.name = "Kratika";
		   s.age = 18;
		   
		   //TO call member inner class Address
		   Student.Address ad = s.new Address();
		   ad.doorNo=85;
		   ad.StreetName="BTM LAYOUT";
		   ad.landMark="Above reliance fresh";
		   ad.city="BENGALURU";
		   ad.state="KARNATAKA";
		   ad.pincode=560076;
		   
		   s.address = ad;// to call method of inner class
		   //Static inner Class
		   Student.Marks m = new Student.Marks();
		   m.m1 = 79;
		   m.m2 = 79;
		   s.marks = m;
		   
		   s.displayStudentDeatils();
	}
}
