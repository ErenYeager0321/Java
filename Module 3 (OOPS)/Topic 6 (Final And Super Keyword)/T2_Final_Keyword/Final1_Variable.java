package T2_Final_Keyword;
/*
    Final Variable
	A final variable is a constant. Once it is given a value, that value 
	cannot be changed.

	When to Use:
	Use final variables when you want to define fixed values that should 
	not change during the program, like configuration settings or
	limits.
	
	Explanation: Of Code
	1.We declared MAX_SPEED using the final keyword.
	2.This means the value 120 cannot be changed later.
	3.If you try to assign a new value like MAX_SPEED = 150, Java will give 
	an error.
	4.Final variables are mostly written in capital letters to show that 
	they are constants.
*/
public class Final1_Variable {
		// Final variable
		final int MAX_SPEED = 120;// Cant be changed its fixed
	
		public void displaySpeed(){
		// Trying to change the value of a final variable will result in a compile-time error
		// MAX_SPEED = 150; // Uncommenting this line will cause an error
		System.out.println("The maximum speed is: " + MAX_SPEED);
		}

	public static void main(String[] args) {
		Final1_Variable example = new Final1_Variable();
		example.displaySpeed();
	}
}

