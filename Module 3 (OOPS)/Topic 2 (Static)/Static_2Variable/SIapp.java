package Static_2Variable;

public class SIapp {
		public static void main(String[] args) {
		BusinessMan b1 = new BusinessMan();
		BusinessMan b2 = new BusinessMan();
		BusinessMan b3 = new BusinessMan();
		
		b1.takeInput();
		b1.calculateSI();
		b1.displaySI();
	
		System.out.println("********************");
	
		b2.takeInput();
		b2.calculateSI();
		b2.displaySI();
	
		System.out.println("********************");
		
		b3.takeInput();
		b3.calculateSI();
		b3.displaySI();
	}
}

