package T3_Methods;
/* Types Of Methods AQn Interface can have
   Public abstract methods, default methods with the implementation, 
   Static method with the implementation, 
   Private method with the implementation.
*/
public interface Rbi {
	void withdraw();
	void deposit();
/*	default void withdrawlimit();// Drawback Of interface is if we 
	change/Add an method so that will give error to every class for 
	that we use default method which needs body in interface. */
	default void withdrawlimit() {
		System.out.println("Limit is 10000");
		checkatm();
	}
	static void denomination() {// Static is also Permitted
		System.out.println("100,200rs noted are permitted");
	}
	private void checkatm() {// cant run bcz cant make obj so we execute this
		System.out.println("Atm is being checked");
	}
	
}

class ucucu implements Rbi {

	public void withdraw() {
	
	}
	public void deposit() {
		
	}
}

class Tbi implements Rbi {
	public void withdraw() {
		
	}
	
	public void deposit() {
		
	}
	
}