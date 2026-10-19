package T1_With_Inheritance;

public class AnimalApp1 {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.name = "Tiger";
		t.eat();
		t.sleep();
		t.display();
		
		Lion l = new Lion();
		l.name = "Lion";
		l.eat();
		l.sleep();
		l.display();

		Deer d = new Deer();
		d.name = "Deer";
		d.eat();
		d.sleep();
		d.display();
	}
}
