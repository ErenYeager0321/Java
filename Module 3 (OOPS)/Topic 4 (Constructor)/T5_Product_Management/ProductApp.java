package T5_Product_Management;

public class ProductApp {
	public static void main(String[] args) {
		Product product1 = new Product("Laptop", 1200.50, "Electronics");
		Product product2 = new Product("Chair", 150.75, "Furniture");
		Product product3 = new Product("Book", 25.99, "Education");

		product1.displayDetails();
		product2.displayDetails();
		product3.displayDetails();
		}
}
