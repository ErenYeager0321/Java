package T2_MemberInnerClass;

class Car {
	private String model;

	public Car(String model) {
		super();
		this.model = model;
	}


	class Engine{
		private int horsepower;
	
		public Engine(int horsepower) {
			super();
			this.horsepower = horsepower;
		}
		
		public void start() {
			System.out.println("The " + model + " engine with " + horsepower + " HP is starting.");
		}
	}
}

public class P1_Car{
	public static void main(String[] args) {
		Car c = new Car("BMW");
		Car.Engine e = c.new Engine(800);
		e.start();
	}
}