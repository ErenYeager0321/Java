package T3_Polymorphism_Practice;


class Plane {
    void takeOff() {
        System.out.println("Plane is taking off");
    }
    void fly() {
        System.out.println("Plane is flying");
    }
    void land() {
        System.out.println("Plane is landing");
    }
}

class PassengerPlane extends Plane {
    void takeOff() {
        System.out.println("Passenger Plane is taking off with passengers");
    }
    void fly() {
        System.out.println("Passenger Plane is flying at medium altitude");
    }
    void land() {
        System.out.println("Passenger Plane is landing at airport");
    }
}

class CargoPlane extends Plane {
    void takeOff() {
        System.out.println("Cargo Plane is taking off with goods");
    }
    void fly() {
        System.out.println("Cargo Plane is flying with heavy cargo");
    }
    void land() {
        System.out.println("Cargo Plane is landing at cargo airport");
    }
}

class FighterPlane extends Plane {
    void takeOff() {
        System.out.println("Fighter Plane is taking off at high speed");
    }
    void fly() {
        System.out.println("Fighter Plane is flying at high speed");
    }
    void land() {
        System.out.println("Fighter Plane is landing on runway");
    }
}

class Process{
	public static void op(Plane p) {
		p.takeOff();
		p.fly();
		p.land();
	}
}

public class P6_Plane {
	public static void main(String[] args) {
		Process.op(new PassengerPlane());
		Process.op(new CargoPlane());
		Process.op(new FighterPlane());
	}
}
