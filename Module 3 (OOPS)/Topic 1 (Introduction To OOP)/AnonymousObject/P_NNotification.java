package AnonymousObject;

public class P_NNotification {
	public static void main(String[] args) {
		new Notification().send();
	}
}
	class Notification{
	void send() {
		System.out.println("Notification Sent!");
	}
	}
