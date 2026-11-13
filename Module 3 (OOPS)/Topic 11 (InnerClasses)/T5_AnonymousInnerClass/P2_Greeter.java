package T5_AnonymousInnerClass;

interface Greeter {
	String greet();
}
public class P2_Greeter {
	public static void main(String[] args) {
		Greeter anonymousGreeter = new Greeter() {
			public String greet() {
				return "Hello from Anonymous Inner Class!";
			}
		};
		System.out.println(anonymousGreeter.greet());
	}
}

