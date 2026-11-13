package T1_Functional_Interface;

public class FunctionalApp {
	public static void main(String[] args) {
/*		Functional f = new Functional() {
			
			@Override
			public void greet() {
			System.out.println("Hello");
			}
		};
		f.greet();
	*/	
		
	//Instead Of all that we can use Lambda Expression for the implementation for that method
	Functional f = ()->System.out.println("Hello"); // ()-> Is the Lambda Expression
	f.greet();
	
	}
}