package T910_Access_Specifier;
/*
 Standard Definition:
	Access specifiers in Java are keywords used to define the visibility 
	or accessibility of classes, methods, and variables. They help in 
	protecting the code by controlling where it can be accessed from.
	
	Simple Explanation:
	Access specifiers tell us who is allowed to use what in your code. 
	They help you protect your data and avoid mistakes. With access 
	specifiers, you decide if something is public for everyone, private 
	for your class only, or protected for child classes, and so on.
	
	Why these are Important?
	• Helps to hide sensitive information inside a class.
	• Makes code safe and secure by preventing unwanted access.
	• Helps in organizing code by showing what should be used where.
	• Makes team projects easier, since each developer knows what they 
	  can and cannot access.
	• It's a core part of object-oriented programming and asked in most 
	  interviews.
	
	Diving into the Four Types of Access Modifiers in Java
	Now that we understand what access modifiers are and why they are 
	important, let's explore the four types:
	1. public – open to all
	2. protected – open to related classes and same package
	3. default (no keyword) – open only in the same package
	4. private – open only inside the same class
 */

/* Till Demo2 All in Same Package(P1)
class Demo {
	public 	  int a=10; public – open to all
	protected int b=20; open to related classes and same package
	/*Default int c=30; open only in the same package
	private   int d=40; open only inside the same class
	
	void display() {
	System.out.println(a); Print Yes ☑
	System.out.println(b); yes ☑
	System.out.println(c); yes☑
	System.out.println(d); yes☑
	}
}

class Demo1 {
	void display1(){
		Demo d = new Demo();
		System.out.println(d.a); ☑
		System.out.println(d.b); ☑
		System.out.println(d.c); ☑
		System.out.println(d.d); ☒
		}
}
class Demo2 extends
	void displayz(){
	S.o.p(a);☑
	S.o.p(b);☑
	S.o.p(c);☑
	S.o.p(d);n☒ Private Doesnt Involves in Inheritance
	}
}

P2 Starts From Here
import p1.Demo;
class Demo3 {
	void display3(){
	Demo d = new Demo();
	S.o.p(d.a);☑
	S.o.p(d.b);☒ open to related classes and same package , both are no true here
	S.o.p(d.c);☒ open only in the same package
	S.o.p(d.d);☒
	}
}

import p1.Demo;
class Demo4 extends Demo{
	void display4() {
	S.o.p(a);☑
	S.o.p(b);☑
	S.o.p(c);☒ open only in the same package
	S.o.p(d);☒ Only to same class
	}
}
		Go Down ↓                       Go up ↑
		Decreasing                      Increasing                   
		Visibility 						Visibility  
		Public							Public
		protected						protected
		default(packagelevel)			default(packagelevel)
		private                         private




*/
public class About {
		
}
