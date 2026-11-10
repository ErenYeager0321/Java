package T3_Polymorphism_Practice;

class Robot {
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

/* 1st Method
class Operate {
	public void oper(Robot r/*ref*) {
		r.learn();
		r.charge();
		r.tasks();
	}
}
*/
public class P1_Robot {
	public static void main(String[] args) {
	/*	1st Method
	    Operate op = new Operate();
		op.oper(new Robot());  
		*/
		// 2nd Method
		Robot r = new Robot();
		operate(r);
	}
	
	// 2nd Method	
	public static void operate(Robot r) {
		r.learn();
		r.charge();
		r.tasks();
	}
}
