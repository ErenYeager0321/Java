package T3_Polymorphism_Practice;

class Order {
	public void prepare() {
		System.out.println("Order is being prepared!");
	}
	public void serve() {
		System.out.println("Order served to the customer!");
	}
	public void bill() {
		System.out.println("Bill prepared for the order!");
	}
}

public class P4_Restaurant {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Order o = new Order();
		new P4_Restaurant().processorder(o);
		System.out.println("------//------");
		processorder(o);
	}
	
	public static void processorder(Order o) {
		o.prepare();
		o.serve();
		o.bill();
	}
}
