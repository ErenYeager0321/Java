package Temparature_Coverter;

public class TemparatureApp {
	public static void main(String[] args) {
			Temperature temp1 = new Temperature();
			
			temp1.setCelsius(25.0);
			
			System.out.println("Initial Temperature:");
			System.out.println("Celsius: " + temp1.getCelsius() + " C");
			System.out.println("Fahrenheit: " + temp1.getFahrenheit() + " F");
			System.out.println();
			
			temp1.setCelsius(30.0);
			
			System.out.println("Final Temperature:");
			System.out.println("Celsius: " + temp1.getCelsius() + " C");
			System.out.println("Fahrenheit: " + temp1.getFahrenheit() + " F");
		}
}
