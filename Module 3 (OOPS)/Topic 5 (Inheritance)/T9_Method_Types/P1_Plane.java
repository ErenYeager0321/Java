package T9_Method_Types;

class Plane{
	void takeoff() {
		System.out.println("Plane is TakingOff ");
	}
	void fly() {
		System.out.println("Plane flies High");
	}
	void land() {
		System.out.println("Plane Lands Safely");
	}
}

class PassengerPlane{
	void fly() { // OverRidden
		System.out.println("Passeneger Plane flies at High Altitude");
	}
	void carryPassengers() { // Child Specific
		System.out.println("Carries Passengers");
	}
}
class CargoPlane{
	void fly() { // OverRidden
		System.out.println("Cargo Plane flies at Medium Speed");
	}
	void carryCargo() { // Child Specific
		System.out.println("Carries Cargo");
	}
}
class FighterPlane{
	void fly() { // OverRidden
		System.out.println("Fighter Plane flies at Medium Speed");
	}
	void carryArms() { // Child Specific
		System.out.println("Carries Arms");
	}
}

public class P1_Plane {
	public static void main(String[] args) {
		Plane p =  new Plane();
		p.takeoff();
		p.fly();
		p.land();
		
		PassengerPlane pp = new PassengerPlane();
		pp.fly();
		pp.carryPassengers();
		
		CargoPlane cp = new CargoPlane();
		cp.fly();
		cp.carryCargo();
		
		FighterPlane fighterplane = new FighterPlane();
		fighterplane.fly();
		fighterplane.carryArms();
		
	}
}
