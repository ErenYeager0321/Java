package T2_Shadowing_Problem;

public class FanApp {
	public static void main(String[] args) {
		Fan f1 =  new Fan(5 , "Crompton");
		System.out.println(f1.noOfWings + " " + f1.brand);
	}
}
