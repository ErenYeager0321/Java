package T1_Without_Inheritance;

public class AnimalApp {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.name = "Tiger";
		t.eat();
		t.sleep();
		
		Lion l = new Lion();
		l.name = "Lion";
		l.eat();
		l.sleep();

		Deer d = new Deer();
		d.name = "Deer";
		d.eat();
		d.sleep();
	}
}
