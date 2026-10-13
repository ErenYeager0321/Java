package T1_Object_Creation;

public class Employe {
	/*  Constructor - A Constructor is a Setter which has same NAME as CLASS and No Return Type(VOID)
	 *  It is called at the time of object creation not after creating the object
	 *  Constructor Overloading --> When Method Have Same Name With Different Signatures/Parameters
								  Create objects with different initial states
								  No return type, not even void
								  Called automatically via new
								  Must match the class name
		Method Overloading --> Perform the same operation with different inputs
							Any valid method name
							Can have different return types
		
		class Box {
		    int w, h;
		
		    // Constructor overloading
		    Box() { w = 0; h = 0; }
		    Box(int w, int h) { this.w = w; this.h = h; }
		
		    // Method overloading
		    int area() { return w * h; }
		    int area(int scale) { return w * h * scale; }
		}   						
    */

	private int id;
	private String Name;
	private int Salary;
	
	// SETTER --> Specialized Setter --> Constructor
	public Employe(int a ,  String b , int c) {
	    id = a;
		Name = b;
		Salary = c;
	}
	//GETTERS
	public int getid() {
			return id;
		}
	public String getName() {
		return Name;
	}
	public int getSalary() {
		return Salary;
	}
}
