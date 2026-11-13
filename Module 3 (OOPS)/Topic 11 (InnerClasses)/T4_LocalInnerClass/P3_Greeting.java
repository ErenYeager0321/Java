package T4_LocalInnerClass;

class GreetingGenerator {
	String generateGreeting(String name, String time) {
	class Greeting {
		String greet() {
		return "Good " + time + ", " + name + "!";
		}
	}
	Greeting greeting = new Greeting();
	return greeting.greet();
	}
}

public class P3_Greeting {
	public static void main(String[] args) {
		GreetingGenerator gg = new GreetingGenerator();
		System.out.println(gg.generateGreeting("Haimiya", "10.00 PM"));
	}
}
