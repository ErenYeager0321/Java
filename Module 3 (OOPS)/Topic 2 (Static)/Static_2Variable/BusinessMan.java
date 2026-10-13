package Static_2Variable;

import java.util.Scanner;

public class BusinessMan {
		String name;
		int p;
		int t;
		static float r;
		float si;
		
		static {
		r=2.0f;
		}
		
		void takeInput() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		name=scan.next();
		System.out.println("Enter P");
		p=scan.nextInt();
		System.out.println("Enter time in months");
		t=scan.nextInt();
		//r=2.0f; if something is common we use static to use them everywhere
		//*when to use -  when the variable value is common for all the objects(void) of the class
		}
		
		void calculateSI() {
		si=(p*t*r)/100;
		}
		
		void displaySI() {
		System.out.println(name+" Businessman SI IS "+si);
		}
}


