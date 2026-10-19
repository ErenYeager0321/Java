package T3_Single_Inheritance;

class Vehicle {
	int wheels = 4;
	
	public void startEngine() {
		System.out.println("Engine started");
	}
}
	
class Car extends Vehicle {
	String carType = "Sedan";
	
	public void openTrunk() {
		System.out.println("Trunk is opened");
	}
}
	
public class Single_Inheritance {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.startEngine(); // Inherited from Vehicle
		myCar.openTrunk(); // Defined in Car
		System.out.println("Car type: " + myCar.carType + " with " + myCar.wheels + " wheels.");
	}
}
