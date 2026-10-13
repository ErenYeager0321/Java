package T1_Object_Creation;

public class Fan {
	int noOfwings;
	String brand;

	public Fan(int a,String b) {
		noOfwings = a;
		brand=b;
	}
	public Fan() {
	}
	public Fan(int a) {
		noOfwings=a;
		brand="Usha";
	}
	/*Constructor Overloading --> When Method Have Same Name With Different Signatures/Parameters
								  Create objects with different initial states
								  No return type, not even void
								  Called automatically via new
								  Must match the class name
	//Method Overloading --> Perform the same operation with different inputs
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
}
