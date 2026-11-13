package T1_Interface_Practice;

public interface P2_Home {
	void turnon();
	void turnoff();
}

class SmartLight implements P2_Home {
	public void turnon() {
		System.out.println("Smart light turns on with adjustable brightness");
	}
	public void turnoff() {
		System.out.println("Smart light turns off");
	}
}

class SmartSecurity implements P2_Home {
	public void turnon() {
		System.out.println("Security system armed");
	}
	public void turnoff() {
		System.out.println("Security system disarmed");
	}
}

class Main2{
	public static void main(String[] args) {
		Light(new SmartLight());
		Light(new SmartSecurity());
	}
	public static void Light(P2_Home sd) {
			sd.turnoff();
			sd.turnoff();
	}
}