package T1_Object_Creation;

public class FanApp {
	public static void main(String[] args) {
		Fan f1 = new Fan(5, "Crompton");//One constructor Can Be Used For 1 Obj
		System.out.println(f1.noOfwings +" "+f1.brand);
	
		Fan f2 = new Fan();//we created a constructor for null so it will use here adn give 0 Null
		System.out.println(f2.noOfwings +" "+f2.brand);
	}
}
