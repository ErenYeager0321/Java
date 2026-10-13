package T2_Shadowing_Problem;

public class Fan {

		int noOfWings;
		String brand;
		
		//Shadowing Problem
	/*	public Fan(int noOfWings, String brand) {
		noOfWings = noOfWings;//The assignment to variable noOfWings has no effect
		brand=brand;//The assignment to variable noOfWings has no effect 
		//Bcz noOfWings = noOfWings both is consdered as local variable
		// Thats why we use 'THIS' here
		}
		*/
		
		//Solution Of Shadowing Prob
		public Fan(int noOfWings, String brand) {
			this.noOfWings = noOfWings;// this.noOfWings this will refer to the current obj in use uper wala
			this.brand=brand;
		}
}
