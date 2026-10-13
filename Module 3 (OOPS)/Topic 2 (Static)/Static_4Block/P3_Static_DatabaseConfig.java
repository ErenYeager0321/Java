package Static_4Block;

public class P3_Static_DatabaseConfig {
	public static void main(String[] args) {
		System.out.println("Database URL: "+DatabaseConfig.get());
		System.out.println("Username "+DatabaseConfig.get1());
		System.out.println("Password "+DatabaseConfig.get2());
	}
}

class DatabaseConfig {
	static String a;
	static {
		a = "jdbc:mysql://localhost:3306/mydatabase";
	}
	
	static String b;
	static {
		b = "Admin";
	}
	
	static String c;
	static {
		c = "123";
	}
	public static String get() {
		return a;
		}
	public static String get1() {
		return b;
		}
	public static String get2() {
		return c;
		}
	}