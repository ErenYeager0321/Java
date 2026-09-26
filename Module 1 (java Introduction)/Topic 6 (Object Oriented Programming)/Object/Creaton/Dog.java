package Object.Creaton;

public class Dog {
	public static void main(String[] args) {
		Dog m1 = new Dog();
		Dog1 d1 = m1.new Dog1();
		d1.bark();
		}
		class Dog1{
		void bark() {
		System.out.println("Dog is barking.");
		}
		}
}
