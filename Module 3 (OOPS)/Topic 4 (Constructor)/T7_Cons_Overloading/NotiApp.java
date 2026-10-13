package T7_Cons_Overloading;

public class NotiApp {
	public static void main(String[] args) {
		Notification notification1 = new Notification();
		Notification notification2 = new Notification("Meeting at 10 AM");
		Notification notification3 = new Notification("Submit report", 2);

		notification1.displayNotification();
		notification2.displayNotification();
		notification3.displayNotification();
	}
}
