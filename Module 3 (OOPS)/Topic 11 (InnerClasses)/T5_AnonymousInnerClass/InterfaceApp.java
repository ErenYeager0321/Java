package T5_AnonymousInnerClass;

public class InterfaceApp {
	public static void main(String[] args) {
		Interface i = new Interface() {
			@Override
			public void display1() {
				System.out.println("Hello");
			}
			@Override
			public void display2() {
				System.out.println("Hello 2");
			}
		};
		i.display1();
		i.display2();
	}
}
