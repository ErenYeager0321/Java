package T3_Polymorphism_Practice;

class Robot1 {
	public void learn() {
		System.out.println("Robots can learn almost anything!");
	}
	public void charge() {
		System.out.println("Robots need charging to operate.");
	}
	public void tasks() {
		System.out.println("Robots complete tasks efficiently!");
	}
}

class CleaningRobot extends Robot {
	public void learn() {
		System.out.println("Cleaning robots learn cleaning techniques fast!");
	}
	
	public void tasks() {
		System.out.println("Cleaning robots clean the house efficiently!");
	}
}

class IndustrialRobot extends Robot {
	public void learn() {
		System.out.println("Industrial robots learn manufacturing processes fast!");
	}
	
	public void tasks() {
		System.out.println("Industrial robots complete industrial tasks efficiently!");
	}
}
/*1st 
class OpRobots{
	public static void operate(Robot r) {
		r.learn();
		r.charge();
		r.tasks();
	}
}
*/
public class P2_Robot1 {
	public static void main(String[] args) {
//	1st	OpRobots.operate(new CleaningRobot());
//		OpRobots.operate(new IndustrialRobot());
	    
		/* 2nd */	
		CleaningRobot cr  = new CleaningRobot();
		operate(cr);
		IndustrialRobot ir  = new IndustrialRobot();
		operate(ir);
	}
	
	// 2nd
	public static void operate(Robot r) {
		r.learn();
		r.charge();
		r.tasks();
	}
}
