package T7_Cons_Overloading_Event;

public class EventApp {
	public static void main(String[] args) {
		Event event1 = new Event();
		Event event2 = new Event("Tech Conference");
		Event event3 = new Event("Charity Run", 300);

		event1.displayEventDetails();
		event2.displayEventDetails();
		event3.displayEventDetails();
	}
}
