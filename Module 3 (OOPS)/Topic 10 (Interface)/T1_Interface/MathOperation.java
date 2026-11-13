package T1_Interface;

public class MathOperation {
	public static void main(String[] args) {
		Math.operate(new CasioCalc());
		Math.operate(new EpsonCalc());
	}
}
