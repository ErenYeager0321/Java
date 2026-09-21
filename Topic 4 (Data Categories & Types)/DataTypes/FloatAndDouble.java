package DataTypes;

public class FloatAndDouble {
   public static void main(String[] args) {
	 
	   float athlete1Weight = 68.45f;
	   float athlete2Weight = 70.55f;
	   System.out.println("Weight of Athlete 1: " + athlete1Weight + " kg");
	   System.out.println("Weight of Athlete 2: " + athlete2Weight + " kg");
	   double athlete1Time = 9.8576341234;
	   double athlete2Time = 10.0012345678;
	   System.out.println("Time taken by Athlete 1: " + athlete1Time + " seconds");
	   System.out.println("Time taken by Athlete 2: " + athlete2Time + " seconds");
	   String winner = athlete1Time < athlete2Time ? "Athlete 1" : "Athlete 2";
	   System.out.println("Winner of the race: " + winner);

	   float num1 = 2.5f;
	   float num2 = 3.4f;
	   float result = num1 * num2;
	   System.out.println(result);
   
	   float a = 1234.56f;
	   float b = 1.23456E+3f;
	   float c = 1.23456f;
	   float d = 1234.56e-3f;
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
	   System.out.println(d);
   
   
   
   }
}
