package T1_Has_A_Realtionship;

public class Charger {
	String color;
	int watts;
	
	public Charger(String color, int watts) {
		super();
		this.color = color;
		this.watts = watts;
	}

	void charge() {
		System.out.println("Charger Is Charging");
	}
}
