package Static_4Block;

public class P2_Static_AppConfig {
	public static void main(String[] args) {
		System.out.println("Application Name: " +AppConfig.get1());
		System.out.println("Version: " +AppConfig.get2());
		System.out.println("Environment: " +AppConfig.get3());
	}
}

class AppConfig {
	static String a;
	static String b;
	static String c;

	static {
		a = "MyApp";
	}
	static {
		b = 	"1.0.0";
	}
	static {
		c = "Production";
	}	

	public static String get1() {
		return a;
	}
	public static String get2() {
		return b;
	}	
	public static String get3() {
		return c;
	}

// Static block to initialize the static variables
// Static methods to get the values of the static variables
}