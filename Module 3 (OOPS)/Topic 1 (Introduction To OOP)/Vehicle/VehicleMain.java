package Vehicle;

public class VehicleMain {
	public static void main(String[] args) {
		vehicle vehicle1 = new vehicle();
		vehicle1.vehicleId = 101;
		vehicle1.make = "Toyota";
		vehicle1.model = "Corolla";
		vehicle1.price = 20000;

		vehicle1.displayDetails();
		vehicle1.applyDiscount(10);

		vehicle vehicle2 = new vehicle();
		vehicle2.vehicleId = 102;
		vehicle2.make = "Honda";
		vehicle2.model = "Civic";
		vehicle2.price = 22000;

		vehicle2.displayDetails();
		vehicle2.applyDiscount(15);
		}
}

	class vehicle{
		int vehicleId;
		String make;
		String model;
		double price;

		public void displayDetails() {
		System.out.println("Vehicle ID: " + vehicleId);
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Price: $" + price);
		}

		public void applyDiscount(double percentage) {
		price -= price * (percentage / 100);
		System.out.println("New Price after discount: $" + price);
		}
	}
