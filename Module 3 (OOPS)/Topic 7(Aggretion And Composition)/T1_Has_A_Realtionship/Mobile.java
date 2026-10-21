package T1_Has_A_Realtionship;

public class Mobile {
	String brand;
	int cost;
	public Mobile(String brand, int cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}
	//Composition
	Os Os = new Os("Android" , 16);
	
	//Aggregation
	Charger ref;
}
