package Static_4Block;

import java.util.Scanner;

public class P4_Static_TemperatureConverter {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		double a = sc.nextDouble();
		if(c.equals("Celsius")) {
		System.out.println("Temperature in Fahrenheit: "+TC.ctf(a));
		} else if (c.equals("Fahrenheit")) {
		System.out.println("Temperature in Celsius: "+TC.ftc(a));
		}
	}
}
class TC {
	public static double ctf(double a) {
		a = ((9*a)/5)+32;
		return a;
	}	
	public static double ftc(double a) {
		a = ((a-32)*5) / 9;
		return a;
	}
}