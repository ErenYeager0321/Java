package Static_4Block;

public class P1_Static_Symphony {
	public static void main(String[] args) {
		System.out.println("Configuration setting is: " +Configuration.get());
	}
}
class Configuration {
	static int a;

	static {
		a = 1024;
	}

	public static int get() {
		return a;
	}
}